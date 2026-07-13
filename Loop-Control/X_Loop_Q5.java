 /*check Armstrong numbers in a given range */
 
 
 import java.util.*;
 public class X_Loop_Q5 {
     public static void main (String [] args){
        
Scanner sc = new Scanner(System.in);

System.out.println("Enter the Starting Value : ");
int start = sc.nextInt();

System.out.println("Enter the Ending Value : ");
int end = sc.nextInt();

System.out.println("Armstrong Number in given Range are : ");

for(int i = start ; i <= end ; i++)
{
    int number = i ;
    int sum = 0;
    int rem ;
    int temp = number ;
    
while(number != 0)
{
    rem = number % 10 ;
    sum = sum + rem*rem*rem ;
    number = number /10 ;
}
if(sum == temp)
{
    System.out.println(sum);
}
}
     }
 }