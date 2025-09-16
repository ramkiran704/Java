class Employee{
    String name;
    String id;
    String depart;
    Employee(String a,String b,String c){
        name=a;
        id=b;
        depart=c;
    }
    void Display(){
        System.out.println("Employee Name:"+name);
        System.out.println("Employee ID:"+id);
        System.out.println("Department:"+depart);
    }
}
class Manager extends Employee{
    int numOfTeamMembers;
    String projectName;
    Manager(String a,String b, String c,int x,String y){
        super(a,b,c);
        numOfTeamMembers=x;
        projectName=y;
    }
    void Display(){
        System.out.println("No OfEmployee :"+numOfTeamMembers);
        System.out.println("Project Name:"+projectName);
    }
}
class Intern extends Employee{
    String university;
    int duration;
    int stipend;
    Intern(String a,String b, String c,String university,int duration,int stipend){
        super(a,b,c);
        this.university=university;
        this.duration=duration;
        this.stipend=stipend;
    }
    void Display(){
        int totalStipend=duration*stipend;
        System.out.println("Total Stipend:"+totalStipend);
    }
}
public class q12 {
    public static void main(String[] args){
        Manager m=new Manager("Sam","sam123","Overall",12,"Bank Management");
        Intern i=new Intern("Sam","sam123","Overall","KTU", 30, 1000);
        System.out.println("Details of Manager:");
        m.Display();
        System.out.println("Details of Intern:");
        i.Display();
    }
}
