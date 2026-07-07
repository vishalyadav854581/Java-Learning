import java.util.*;
public class While_Loop_Q5 {
    public static void main (String [] args ){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number : ");
int number = sc.nextInt();

int count = 1 ;
int sum = 0 ;
while(count <= number)
{
 if(count%2 != 0)
 {
    sum = sum+count ;
     
 }
 count++ ;
}
System.out.println("Sum of the Odd number till "+number+" is = " +sum);
    }
}
