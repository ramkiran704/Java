import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        try {
            // Trying to open a file that does not exist
            File file = new File("nonexistent.txt");
            Scanner sc = new Scanner(file);
            System.out.println("File found and opened successfully!");
            sc.close();
        } 
        catch (FileNotFoundException e) {
            // Handling the FileNotFoundException
            System.out.println("Error: File not found!");
            System.out.println("Exception Message: " + e.getMessage());
        }
        
        System.out.println("Program continues after handling the exception.");
    }
}
