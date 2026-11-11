/*
Get the 3rd bit(position=2) of a number n. (n=0101)
Bit Mask:1<<i
operation: AND with NOT
*/
import java.util.*;
public class AndWithNot{
    public static void main(String[] args){
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);
        int newNum = notBitMask & n;
        System.out.println(newNum);
    }
}