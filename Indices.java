import java.util.*;
public class Indices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("Enter the element at position: " + i + " " + j + ":" + " ");
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}