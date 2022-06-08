// Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;

public class Average {
    public void average(int N1,int N2, int N3){
        float avg=(N1+N2+N3)/3;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1= num.nextInt();
        int num2= num.nextInt();
        int num3= num.nextInt();   
        Average obj = new Average();
        obj.average(num1,num2,num3) ;  
        num.close();
    }

}//end of class