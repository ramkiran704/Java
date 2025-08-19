public class RecursivFactorial {
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; 
        } else {
            return n * factorial(n - 1); 
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }
        int num = Integer.parseInt(args[0]);
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        long result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
}
