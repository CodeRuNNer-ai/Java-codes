//Get the 1st bit of a number

public class GetBit {
    public static void main(String[] args) {
        int n = 10;
        int pos = 0;

        int bitMask = 1 << pos;

        if ((n & bitMask) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}