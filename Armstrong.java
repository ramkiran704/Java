import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter any number:");
        int num=scanner.nextInt();
        int n=num;
        int sum=0;

        while(n!=0){
            int d=n%10;
            n=n/10;
            sum=sum+d*d*d;
        }
        if (num==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        scanner.close();
    }
    
}
