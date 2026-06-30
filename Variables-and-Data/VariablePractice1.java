 import java.util.*;
 
 public class VariablePractice1 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name :");
        String name = sc.nextLine();
        
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        System.out.println("Enter yout grade ");
        char grade = sc.next().charAt(0);
        
        System.out.println("Your name is " +name);
        System.out.println("Your age is "  +age);
        System.out.println("Your grade is " +grade);
        
        
        sc.close();
    }
}