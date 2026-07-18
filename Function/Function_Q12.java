/*  FUNCTION WITH SIMMPLE RETURN KEYWORD  */

public class Function_Q12 {
    public static void add(int a , int b)
    {
        int r = a+b ;
        if(r > 50)
            {
                return ;
            }
            System.out.println("Sum : " +r);
    }
    public static void main(String [] args)
    {
        add(12 , 5);
   }
    }
    

