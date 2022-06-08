// Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class Greatest {
    public int greatest(int N1, int N2){
        if(N1>N2){
            return N1;
        }
        else{
            return N2;
        }
    }
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        Greatest obj =new Greatest();
        int greater = obj.greatest(num1,num2);
        System.out.println(greater + " is greater");
        num.close();
    }
}
