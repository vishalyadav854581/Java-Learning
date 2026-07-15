  import java.util.*;
 public class Do_While_Loop_Q4 {
    public static void main (String [] args ){

           Scanner sc = new Scanner(System.in);

        int number;


        do{
            
            System.out.println("Enter the Number :");
            number = sc.nextInt();
            
            if(number % 2 == 0)
            {
                System.out.println("Even Number ");
            }
            
            else {
                    System.out.println("Odd Number");
                 }
            
        }
         while(number != 0);
        }
    }
