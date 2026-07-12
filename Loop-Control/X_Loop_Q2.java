/*Palindrome Number */



import java.util.*;
public class X_Loop_Q2 {
    public static void main (String [] args){

Scanner sc = new Scanner (System.in);
System.out.println("Enter the Number : ");
int number = sc.nextInt();

int rem = 0 ;
int result = 0 ;
int temp = number ;

while(number != 0)
{
    rem = number%10;
    result = result*10 + rem ;
    number = number/10;
}
number = temp ;

if(number == result)
{
    System.out.println("Given number "+number+" is Palindrome Number");
}
else
{
     System.out.println("Given number "+number+" is not Palindrome Number");
}
    }
}