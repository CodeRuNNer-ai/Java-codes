import java.util.*;
public class Tdarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int col = sc.nextInt();
        int numm[][] = new int[row][col];
        for(int i=0; i<numm.length; i++){
            for(int j=0; j<numm[i].length;j++){
                System.out.println("Enter the element at position " + (i + 1) + " " + (j + 1) + ":");
                numm[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of 2D array are: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col;j++){
                System.out.print(numm[i][j] + " ");
            } 
        }
        System.out.println();

    }
}