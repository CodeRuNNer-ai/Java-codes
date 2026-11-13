//Set a particular bit to 1
public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        int newNum = n | bitMask;

        System.out.println(newNum);
    }
}