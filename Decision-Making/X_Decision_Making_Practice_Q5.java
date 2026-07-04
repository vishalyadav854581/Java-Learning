

import java.util.Scanner;

  public class X_Decision_Making_Practice_Q5 {
    public static void main (String [] args ) {
         
Scanner sc = new Scanner(System.in);         
System.out.println("Enter the Year");
int year = sc.nextInt();

if(year % 400 == 0)
{
    System.out.println("Year is leap year :");
}
else if (year % 100 == 0)
{
 System.out.println("Year is not leap year :");   
}
else if (year % 4 == 0)
{
    System.out.println("Year is leap year :");
}
 else
 {
      System.out.println("Year is not leap year :");
 }
     }
}


