import java.util.Scanner;
public class Sumof6not4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);

        int sum=0;
        int count=0;
        for(int i=0;i<100;i++){
            if(i%6==0 && i%4!=0){
                sum=sum+i;
                count++;
            }
        }
        System.out.println("Sum ="+ sum);
        System.out.println("Count ="+ count);
        scanner.close();
    }
}
