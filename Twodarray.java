import java.util.*;
public class Twodarray{
    public static void main(String[] args){
        int[][] numbers = new int[2][2];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
    }
}