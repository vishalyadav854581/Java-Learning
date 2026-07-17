import java.util.*;
public class Function_Q1 {
    public static void main(String[] args) {
        Sum();
        Sum();
    }

    static void Sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int number1 = sc.nextInt();

        System.out.print("Enter Number 2: ");
        int number2 = sc.nextInt();

        int sum = number1 + number2;

        System.out.println("Sum = " + sum);
    }
    
}
