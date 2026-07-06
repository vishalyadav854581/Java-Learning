import java.util.*;
public class For_Loop_Q6 {
    public static void main (String [] args){

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the Number :");
 int num = sc.nextInt();
 
 int Sum = 0 ;
 for(int i = 0 ; i < num ; i++)
 {
    if(num%2 == 0)
    {
        Sum = Sum + i ;
    }
 }
 System.out.println("Sum of Even Number till " + num + " is = " +Sum);
    }
 }
