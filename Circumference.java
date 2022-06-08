// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class Circumference {
    public float circumference(int r){
        float pi = 3.14F;
        return 2*pi*r;
    }
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius = num.nextInt();
        Circumference obj =new Circumference();
        float Ans = obj.circumference(radius);
        System.out.println(Ans + " is the obtained circumference");
        num.close();
    }
    
}
