// Write a program to enter the numbers till the user wants and at the end it should 
// display the count of positive, negative and zeros entered. 
import java.util.Scanner;
public class numbersCount {
  
    public static void main(String[] args) {
        int positive=0;
        int negative=0;
        int zero=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter '0' to stop '1' to continue");
        int num = sc.nextInt();
        while(num==1){
            System.out.println("Enter the number:");
            int number = sc.nextInt();
            if (number==0){
                zero++;
            }
            else if(number<0){
                negative++;
            }
            else{
                positive++;
            }
            System.out.println("Enter '0' to stop '1' to continue");
            num = sc.nextInt();
        
        }
        System.out.printf("Number count:\n Positive:%d \n Negative:%d\n Zero:%d",positive,negative,zero);
        
    }
}
