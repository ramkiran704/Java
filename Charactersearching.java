import java.util.Scanner;

public class Charactersearching {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Any String:");
        String str=scanner.next();

        System.out.println("Enter the Substring to Search:");
        char ch=scanner.next().charAt(0);

        int f=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                f++;
            }
        }
        System.out.println("The frequency of "+ch+":"+f);
        scanner.close();
    }
   
}
