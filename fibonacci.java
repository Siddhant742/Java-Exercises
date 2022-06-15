// Write a program to print Fibonacci series of n terms where n is input by user :
import java.util.Scanner;
public class fibonacci {
    public void fibo(int n) {
        int n1=0;
        int n2=1;
        int temp;
        int series=0;
        if (n>1){
        for(int i=1;i<=n;i++){
            System.out.print(series+" ");
            series=n1+n2;
            n2=n1;
            n1=series;
        }
        }
         
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of terms you want display:");
        int terms= sc.nextInt();
        fibonacci obj=new fibonacci();
        obj.fibo(terms);
    }
}
