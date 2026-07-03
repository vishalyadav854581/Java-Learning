 //Income Tax Calculator
 
 import java.util.*;
public class IF_ELSE_IF_Q2 {
    public static void main (String [] args){
        

    double tax = 0 ;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Your income : ");
    int income = sc.nextInt();
    
    //int age = sc.nextInt();
    double taxpayed = 0;

    if(income <= 500000) 
    {
      tax = 0 ;
      System.out.println("Tax you have to Pay  " + tax)  ;
      taxpayed = income - tax;
      System.out.println("Your total income after tax pay " +taxpayed);
    }
    
    else if (income > 500000 && income <= 1000000)
    {
      tax = income*0.20 ;
      System.out.println ("Tax you have to Pay  " + tax);
      taxpayed = income - tax;
      System.out.println("Your total income after tax pay " +taxpayed);
    }
    
    else
    {
      tax = income*0.30 ;
      System.out.println ("Tax you have to Pay  " + tax);
      taxpayed = income - tax;
      System.out.println("Your total income after tax pay " +taxpayed);
    }
    }
    
}
