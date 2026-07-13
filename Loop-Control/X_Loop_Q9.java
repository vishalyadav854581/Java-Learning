/*Swapping of the Value Without Using Third Variable */

public class X_Loop_Q9 {
    public static void main (String [] args){

        int a = 10 ;
        int b = 20 ;

// Swapping of the value 

a = a+b ;
b = a-b ;
a = a-b ;


System.out.println("Value of a :" +a);
System.out.println("Value of b :" +b);
    }
}
