import java.util.Scanner;
public class Case {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Charater:");
        char ch=scanner.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println("Character is UpperCase");
        }
        else if (Character.isLowerCase(ch)){
            System.out.println("Character is LowerCase");
        }
        else{
            System.out.println("Not a Charater.");
        }
    }
}