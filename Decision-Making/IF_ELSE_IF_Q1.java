import java.util.*;
public class IF_ELSE_IF_Q1 {
    public static void main (String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age : ");
    int age = sc.nextInt();

    if(age <= 0 || age > 120) 
    {
      System.out.println(" Invalid Age ")  ;
    }
    else if (age > 1 && age <=4)
    {
        System.out.println(" You are child ");
    }
    else if(age > 4 && age <= 10)
    {
        System.out.println("You are are kid");
    }
    else if(age > 11 && age <= 18)
    {    
     System.out.println("You are Teenager");
    }
    else
    {
System.out.println(" You are man ");
    }
    }
    
}
