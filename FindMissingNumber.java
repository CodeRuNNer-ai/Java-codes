public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};

        int xor = 0;

        for (int i = 1; i <= 5; i++) {
            xor ^= i;
        }

        for (int num : arr) {
            xor ^= num;
        }

        System.out.println("Missing number: " + xor);
    }
}