import java.util.*;
public class IF_ELSE_IF_Q5 {
    public static void main (String [] args)
    {

Scanner sc = new Scanner(System.in);
System.out.println("Enter your Percentage");
int Percentage = sc.nextInt();    

if(Percentage > 100)
{
    System.out.println("Invalid Percentage");
}
else if(Percentage >= 90 )
{
    System.out.println("A Grade");
}
else if(Percentage >= 75 && Percentage <=89 )
{
     System.out.println("B Grade");
}
else if(Percentage >= 60 && Percentage <=74 )
{
    System.out.println("C Grade");
}
else if(Percentage >= 33 && Percentage <= 59)
{
    System.out.println("D Grade");
}
else 
{
    System.out.println("Fail");
}
    }
    
}
