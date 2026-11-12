/*
Update the 2nd bit(position = 1) of a number n to 1. (n=0101)

for 1 
Bit Mask: 1<<i
operation: AND with NOT

For 0
Bit Mask: 1<<i
Operation:OR
*/
import java.util.*;
public class UpdateBit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        //oper=1: set oper=0: clear
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper == 1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else{
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        } 
    }
}