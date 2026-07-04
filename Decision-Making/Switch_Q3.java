 // CALCULATOR
 
 import java.util.*;
public class Switch_Q3 {
    public static void main (String[] args){

  Scanner sc = new  Scanner(System.in);     
  System.out.println("Enter the Number 1");
  int a = sc.nextInt();
  
  System.out.println("Enter the Number 2");
  int b = sc.nextInt();
  
  System.out.println("Enter the Operator");
  char Operator = sc.next(). charAt(0);
  
  switch(Operator) {
      
case '+' : System.out.println("Addition =" + (a+b));
break ;

case '-' : System.out.println("Subtraction ="+ (a-b));
break ;

case '*' : System.out.println("Multipilicaton = "+ ( a*b));
break ;

case '/' : System.out.println("Division = "+ (a/b));
break ;

case '%' : System.out.println("Modulus = "+ (a%b));
break ;

default : System.out.println("Ivalid Operator");
  }
   }
}
