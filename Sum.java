//Write a function to print the sum of all odd numbers from 1 to n. 
import java.util.Scanner;

public class Sum{
    public void printSum(){
        int i,n,sum=0 ;
        Scanner num=new Scanner(System.in);
        System.out.println("Enter the nummber upto which you want the sum of odd numbers:");
        n=num.nextInt();
        for(i=1;i<=n;i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("The Sum is "+ sum);
        num.close();
    }
    public static void main(String[] args){
        Sum obj= new Sum();
        obj.printSum();
    }
}
