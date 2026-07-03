// LEAP YEAR OR NOT 
//if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) agar es logic se nahi karte to
// ye oder 400 , 100 , 4 follow karna hota hai


import java.util.Scanner;

public class IF_ELSE_IF_Q4 {
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
