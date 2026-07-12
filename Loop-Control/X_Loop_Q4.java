/*Armstrong Number */


import java.util.*;

public class X_Loop_Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        int temp = number;
        int rem;
        int sum = 0;

        while (number != 0) {
            rem = number % 10;
            sum = sum + rem * rem * rem;
            number = number / 10;
        }

        if (temp == sum) {
            System.out.println("Given Number is Armstrong Number");
        } else {
            System.out.println("Given Number is not Armstrong Number");
        }

        
    }
}