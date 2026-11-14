public class RepresentNum {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;

        while (n > 0) {
            count++;
            n = n >> 1;
        }

        System.out.println("Total bits: " + count);
    }
}