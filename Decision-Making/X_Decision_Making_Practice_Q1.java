/*Question 1 : Write a Java program to get a number from the user and print whether it is
positive or negative.*/

import java.util.*;
public class X_Decision_Making_Practice_Q1 {
    public static void main (String []args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int number = sc.nextInt();

if(number == 0)
{
    System.out.println("Invalid number");
}
else if(number > 0)
{
    System.out.println("Positive Number");
}
else if(number < 0)
{
    System.out.println("Number is negative");
}
else 
{
    System.out.println("Invalid number");
}
    }
    
}
