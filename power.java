import java.util.Scanner;
import java.util.*;
// Two numbers are entered by the user, x and n. Write a function to 
// find the value of one number raised to the power of another i.e. x^n.
public class power {
    public static double find(int a,int b){
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter x:"); 
        int x= sc.nextInt();
        System.out.println("Enter n:");
        int n= sc.nextInt();
        double result= find(x,n);
        System.out.println("x^n equals to: "+ result);
        sc.close();
    }
        

}
