import java.util.*;
public class Arrayy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();    
        int[] marks = new int[size];

        //INPUT
        for(int i=0; i<size; i++){
            marks[i]=sc.nextInt();
        }

        //OUTPUT
        for(int i=0; i<size; i++){
            System.out.println(marks[i]); 
        }
    }
}