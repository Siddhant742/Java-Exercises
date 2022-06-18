// Print the spiral order matrix as output for a given matrix of numbers. 

import java.util.Scanner;
public class SpiralMatrix{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the order of 2D array(row and then column):");
        int m= sc.nextInt();
        int n= sc.nextInt();
        int colStart=0;
        int rowStart=0;
        int colEnd=n-1;
        int rowEnd=m-1;
        int [][] A = new int[m][n];
        System.out.println("Enter the array element you want to store:");
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++){
                A[rowStart][i]= sc.nextInt();
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++){
                A[i][colEnd]= sc.nextInt();
            }
            colEnd--;
            for(int i=colEnd;i>=colStart;i--){
                A[rowEnd][i]= sc.nextInt();
            }
            rowEnd--;
            for(int i=rowEnd;i>=rowStart;i--){
                A[i][colStart]= sc.nextInt();
            }
            colStart++;
        }
        System.out.println("The output Array is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }

    

}