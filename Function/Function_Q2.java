import java.util.Scanner;

public class Function_Q2 {
    
    static void Sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number 1:");
        int number_1 = sc.nextInt();

        System.out.println("Enter the Number 2:");
        int number_2 = sc.nextInt();

        int sum = number_1 + number_2;

        System.out.println("Sum of the 2 number is : " + sum);
    }

    public static void main(String[] args) {
        Sum();
        Sum();
    }
}
