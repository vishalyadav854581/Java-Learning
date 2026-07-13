/*Greatest Common Divisor */

public class X_Loop_Q10 {
    public static void main (String [] args){

        int number_1 = 15 ;
        int number_2 = 18 ;
        int gcd = 1 ;

        for(int i = 1 ; i<= number_1 && i<= number_2 ; i++)
        {
            if(number_1 % i == 0 && number_2 % i == 0)
            {
                System.out.println(i +" ");
                gcd = i ;
            }
        }
System.out.print("");
System.out.println("GCD = " +gcd);
    }
}

/*
int a = 15;
         int b = 20;

while (b != 0) {
    
    int temp = b;
    b = a % b;
    a = temp;
}

System.out.println("GCD = " + a);
System.out.print("");


*/
