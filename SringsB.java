import java.util.*;
public class SringsB{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //Char at index 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}