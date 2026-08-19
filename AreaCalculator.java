public class AreaCalculator {
    public static void main(String[] args) {
        if(args.length==1){
            double l=Double.parseDouble(args[0]);
            double area=l*l;
            System.out.println("Area="+area);
        }
        else if(args.length==2){
            double l1=Double.parseDouble(args[0]);
            double b=Double.parseDouble(args[1]);
            double area=l1*b;
            System.out.println("Area="+area);
        }
        else
            System.out.println("Invalid Input");
    }
}
