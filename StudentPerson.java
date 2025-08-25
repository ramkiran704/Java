
class BasePerson {
    String name;
    int age;
    BasePerson(String a,int b){
        name=a;
        age=b;
    }
    void displayInfo(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
}
class DerivedStudent extends BasePerson{
   
    String grade;
    DerivedStudent(String name,int age,String x){ 
        super(name,age);
        grade=x;
    }
    void displayInfo1(){
        displayInfo();
        System.out.println("Grade:"+grade);
    }
}
public class StudentPerson {
    public static void main(String[] args){
        DerivedStudent ob=new DerivedStudent("Sam",19,"S");
        ob.displayInfo1();
    }
}
