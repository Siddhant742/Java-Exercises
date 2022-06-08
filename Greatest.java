// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class Greatest {
    public void greatest(int N1, int N2){
        if(N1>N2){
            System.out.println(N1 + " is greater");
        }
        else{
            System.out.println(N2 + " is greater"); 
        }
    }
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        Greatest obj =new Greatest();
        obj.greatest(num1,num2);
        num.close();
    }
}
