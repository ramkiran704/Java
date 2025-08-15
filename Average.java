import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Any Three numbers :");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();

        int sum=n1+n2+n3;
        int avg=sum/3;

        System.out.println("The Average of Three Numbers:"+avg);
        scanner.close();
    }
}
