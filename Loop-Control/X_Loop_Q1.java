 /*Reverse of the Number */
 
 
import java.util.*;
public class X_Loop_Q1 {
     public static void main (String [] args){
         
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number : ");
int number = sc.nextInt();

int temp = number ;
int result = 0;
int rem ;
 
  while(number !=0)
 {
     rem = number % 10 ;
     result=result*10 +rem;
     number = number /10 ;
}
  System.out.println("Reverse of the Number is : "+result);
 
     }
 }