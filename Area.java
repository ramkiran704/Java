import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the Radius of Circle:");
        int radius =scanner.nextInt();

        System.out.println("Area of Circle:"+(3.14*radius*radius));
    }
}
