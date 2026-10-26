import java.util.*;
public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation (1 for addition, 2 for subtraction, 3 for multiplication, 4 for division): ");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Result: " + (a+b));
                break;
            case 2:
                System.out.println("Result: " + (a-b));
                break;
            case 3:
                System.out.println("Result: " + (a*b));
                break;
            case 4:
                System.out.println("Result: " + (a/b));
                break;
        }
    }
}