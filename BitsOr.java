/*
Get the 3rd bit(position=1) of a number n. (n=0101)
Bit Mask:1<<i
operation: And
*/
import java.util.*;
public class BitsOr{
    public static void main(String[] args){
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        
        int newNum = n | bitMask;
        System.out.println(newNum);
        if((newNum)==0){
            System.out.println("Bit was zero");
        } else{
            System.out.println("Bit was one");
        }
    }
}