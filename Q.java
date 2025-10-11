class Employee{
    int salary;
    String name;
    Employee(String name,int salary){
        this.salary=salary;
        this.name=name;
    }
    void displayDetails(){
        System.out.println("Name:"+name+"\t"+"Salary:"+salary);
    }
}
class Manager extends Employee{
    int bonus;
    Manager(String name,int salary,int bonus){
        super(name,salary);
        this.bonus=bonus;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Bonus:"+bonus);
    }
}
class Developer extends Employee{
    String project;
    Developer(String name,int salary,String project){
        super(name,salary);
        this.project=project;
    }
    void displayDetails(){
        super.displayDetails();
        System.out.println("Project:"+project);
    }
}
public class Q {
    public static void main(String[] args) {
        Manager m=new Manager("Ram",100000,40000);
        Developer d=new Developer("Sam",12000,"Parking Lot");
        Employee e;
        e=m;
        e.displayDetails();
        e=d;
        e.displayDetails();
    }
}
