import java.util.*;

class CharacterClass

{

public static void main(String args[])

{

Scanner sc=new Scanner(System.in);

char c=sc.next().charAt(0);

System.out.println("Letter:"+Character.isLetter(c));

System.out.println("Digit:"+Character.isDigit(c));

System.out.println("LetterOrDigit:"+Character.isLetterOrDigit(c));

System.out.println("Upper:"+Character.isUpperCase(c));

System.out.println("Lower:"+Character.isLowerCase(c));

System.out.println("ConvertToLower:"+Character.toLowerCase(c));

System.out.println("ConvertToUpper:"+Character.toUpperCase(c));
sc.close();
}}
