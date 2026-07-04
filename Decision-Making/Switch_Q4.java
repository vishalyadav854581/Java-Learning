import java.util.Scanner;

public class Switch_Q4 {
    public static void main (String [] args){
         
Scanner sc = new Scanner (System.in);
System.out.println("Enter the Number ");
int number = sc.nextInt();

switch(number){
    
case 1 : System.out.println("Login ");  
break ;

case 2 : System.out.println("Register");
break ;

case 3 : System.out.println("Profile ");  
break ;

case 4 : System.out.println("Setting");
break ;

case 5 : System.out.println("Exit");
break ;

default : System.out.println("Invalid choice");
}
     }
}
