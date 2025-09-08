import java.util.Scanner;

public class Main{  
  public static void main(String[] args){  
      Scanner sc = new Scanner(System.in);
      
      Admin admin = new Admin("admin", "admin123");

      ParkingSlot[] slots = new ParkingSlot[10];
      ParkingRecord[] records = new ParkingRecord[20];
      ParkingManager[] managers = new ParkingManager[10];

      int recordCount = 0, managerCount = 0;
      int vehicleCount = 0;

      for (int i = 0; i < slots.length; i++)    
        slots[i] = new ParkingSlot(i + 1);  

      boolean running = true;
      while (running){ 
        System.out.println("\n--- Login ---");
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        
        //Admin
        if (admin.login(user, pass)){  
          boolean adminMenu = true;
           while (adminMenu){ 
            System.out.println("\n--- Admin Menu ---");
             System.out.println("1. Assign Slot");
             System.out.println("2. Release Slot");
             System.out.println("3. View Slot Status");
             System.out.println("4. View All Vehicle Details");
             System.out.println("5. Register Parking Manager");
             System.out.println("6. View Final Report");
             System.out.println("7. Logout");
             System.out.print("Enter your choice: ");
             int choice = Integer.parseInt(sc.nextLine());

             switch (choice)
             {
                   case 1:
                     System.out.print("Enter vehicle number: ");
                     String num = sc.nextLine();
                     System.out.print("Enter owner name: ");
                     String owner = sc.nextLine();
                     System.out.print("Enter vehicle type: ");
                     String type = sc.nextLine();
                     boolean slotFound = false;
                     for (int j = 0; j < slots.length; j++)
                     {
                        if (slots[j].checkAvailability())
                        {
                           Vehicle v = new Vehicle(vehicleCount + 1, num, owner, type);
                           vehicleCount++;

                           slots[j].assignSlot();
                           records[recordCount] = new ParkingRecord(recordCount + 1, v, slots[j]);
                           System.out.println("Slot " + slots[j].slotId + " assigned to Vehicle " + v.vehicleNumber);
                           recordCount++;
                           slotFound = true;
                           break;
                        }
                     }
                     if (!slotFound)  
                     {  System.out.println("No slots available!");      }                  
                     break;

                   case 2:
                     System.out.print("Enter Vehicle Number to release slot: ");
                     String releaseNum = sc.nextLine();
                     boolean released = false;
                     for (int j = 0; j < recordCount; j++)  
                     {  if (records[j].vehicle.vehicleNumber.equals(releaseNum))
                        {  records[j].closeRecord();
                           records[j].slot.freeSlot();
                           System.out.println("Vehicle exited. Fee = Rs." + records[j].fee);
                           released = true;
                           break;
                        }
                     }
                     if (!released)  
                     {  System.out.println("Vehicle not found!");           }
                     break;

                   case 3:
                     for (int j = 0; j < slots.length; j++) {
                         Vehicle occupyingVehicle = null;
                         if (!slots[j].checkAvailability()) {
                             for (int k = 0; k < recordCount; k++) {
                                 if (records[k].slot.slotId == slots[j].slotId && records[k].exitTime == 0) {
                                     occupyingVehicle = records[k].vehicle;
                                     break;
                                 }
                             }
                         }
                         slots[j].printStatus(occupyingVehicle);
                     }
                     break;
                   
                   case 4:
                        System.out.println("\n--- All Parked Vehicle Details ---");
                        boolean foundVehiclesAdmin = false;
                        for (int j = 0; j < recordCount; j++)
                        {
                            if (records[j].exitTime == 0)
                            { 
                                System.out.println("Record ID: " + records[j].recordId);
                                records[j].vehicle.getVehicleInfo();
                                foundVehiclesAdmin = true;
                            }
                        }
                        if (!foundVehiclesAdmin)
                        {
                            System.out.println("No vehicles are currently parked.");
                        }
                        break;

                   case 5:
                     System.out.print("Enter new manager ID: ");
                     String mgrId = sc.nextLine();
                     System.out.print("Enter password: ");
                     String mgrPass = sc.nextLine();
                     managers[managerCount++] = admin.register(mgrId, mgrPass);
                     System.out.println("Manager registered successfully!");
                     break;

                   case 6:
                     admin.finalReport(records, recordCount);
                     break;

                   case 7:
                     admin.logout();
                     adminMenu = false;
                     break;
             }
           }
         }

         //Parking Manager
         else
         {
           boolean found = false;
           for (int i = 0; i < managerCount; i++)
           {
             if (managers[i].login(user, pass))
             {
               found = true;
               boolean mgrMenu = true;
               while (mgrMenu)
               {
                 System.out.println("\n--- Parking Manager Menu ---");
                 System.out.println("1. Assign Slot");
                 System.out.println("2. Release Slot");
                 System.out.println("3. View Slot Status");
                 System.out.println("4. View All Vehicle Details");
                 System.out.println("5. Logout");
                 System.out.print("Enter your choice: ");
                 int choice = Integer.parseInt(sc.nextLine());

                 switch (choice)
                 {
                    case 1:
                     System.out.print("Enter vehicle number: ");
                     String num = sc.nextLine();
                     System.out.print("Enter owner name: ");
                     String owner = sc.nextLine();
                     System.out.print("Enter vehicle type: ");
                     String type = sc.nextLine();
                     boolean slotFound = false;
                     for (int j = 0; j < slots.length; j++)  
                     {
                       if (slots[j].checkAvailability())  
                       {
                         Vehicle v = new Vehicle(vehicleCount + 1, num, owner, type);
                         vehicleCount++;

                         managers[i].assignSlotToVehicle(slots[j], v);
                         records[recordCount] = new ParkingRecord(recordCount + 1, v, slots[j]);
                         recordCount++;
                         slotFound = true;
                         break;
                       }
                     }
                     if (!slotFound)  
                     {  System.out.println("No slots available!");      }                  
                       break;

                      case 2:
                        System.out.print("Enter Vehicle Number to release slot: ");
                        String releaseNum = sc.nextLine();
                        boolean released = false;
                        for (int j = 0; j < recordCount; j++)  
                        {  if (records[j].vehicle.vehicleNumber.equals(releaseNum))
                           {  records[j].closeRecord();
                              records[j].slot.freeSlot();
                              System.out.println("Vehicle exited. Fee = Rs." + records[j].fee);
                              released = true;
                              break;
                           }
                        }
                        if (!released)  
                        {  System.out.println("Vehicle not found!");           }
                        break;

                      case 3:
                        for (int j = 0; j < slots.length; j++) {
                            Vehicle occupyingVehicle = null;
                            if (!slots[j].checkAvailability()) {
                                for (int k = 0; k < recordCount; k++) {
                                    if (records[k].slot.slotId == slots[j].slotId && records[k].exitTime == 0) {
                                        occupyingVehicle = records[k].vehicle;
                                        break;
                                    }
                                }
                            }
                            slots[j].printStatus(occupyingVehicle);
                        }
                        break;
                      
                      case 4:
                        System.out.println("\n--- All Parked Vehicle Details ---");
                        boolean foundVehiclesMgr = false;
                        for (int j = 0; j < recordCount; j++)
                        {
                            if (records[j].exitTime == 0)
                            { 
                                System.out.println("Record ID: " + records[j].recordId);
                                records[j].vehicle.getVehicleInfo();
                                foundVehiclesMgr = true;
                            }
                        }
                        if (!foundVehiclesMgr)
                        {
                            System.out.println("No vehicles are currently parked.");
                        }
                        break;

                      case 5:
                        managers[i].logout();
                        mgrMenu = false;
                        break;
                   }
                }
             }
           }
           if (!found)  
           {  System.out.println("Invalid login!");      }
         }
      }
   }
}