import java.util.Scanner;
public class PalindromeofString {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String str=input;

        String reverse= "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        if(str.equals(reverse)){
            System.err.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
