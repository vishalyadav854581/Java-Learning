//Largest of Two Numbers

import java.util.*;
public class IF_ELSE_Q5 {
    public static void main(String [] args){

Scanner sc = new Scanner (System.in);
System.out.println("Enter the number 1 ");
int number_1 = sc .nextInt();

 
System.out.println("Enter the number 2 ");
int number_2 = sc .nextInt();

if(number_1 > number_2 )
{
    System.out.println("Number_1 " +number_1 +" is greater than number_2 " +number_2);
}
else 
{
    System.out.println("Number_2 " +number_2 +" is greater than number_1 " +number_1);
}

    }
}
