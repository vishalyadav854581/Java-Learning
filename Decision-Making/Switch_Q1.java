import java.util.*;
public class Switch_Q1 {
    public static void main (String [] args){

Scanner sc = new Scanner (System.in) ;
System.out.println("Enter the Number ");
int number = sc.nextInt();

switch(number) {

case 1 :
    System.out.println("Burger");
    break;

case 2 :
    System.out.println("Samosa");
    break;

case 3 :
    System.out.println("Pizza");
    break;

    default :
    System.out.println("Invalid Choice item is not avaible");

       }
    }
    
}
