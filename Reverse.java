package reversepackage;
public class Reverse {
    public String input;
    public Reverse (String input){
        this.input=input;
    }
    public void reverse(){
        String reverse= "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        System.out.println("Reversed string: " + reverse);
    }
}
