// Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.Scanner;
public class CommonDivisor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        while(a!=b){
        if(a>b){
            a=a-b;
        }
        else{
            b=b-a;
        }
       
        }
        System.out.println("The greater common divisor is"+ b);
    }
}
