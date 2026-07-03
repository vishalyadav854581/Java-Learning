import java.util.*;
public class IF_ELSE_IF_Q3 {
    public static void main (String [] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter Number_1 ");
int Number_1 = sc.nextInt();

System.out.println("Enter Number_2 ");
int Number_2 = sc.nextInt();

System.out.println("Enter Number_3 ");
int Number_3 = sc.nextInt();

if(Number_1 > Number_2 && Number_1 > Number_3)
{
    System.out.println("Number_1 is greatest");
}
else if (Number_2 > Number_3)
{
     System.out.println("Number_2 is greatest");
}
else
{
 System.out.println("Number_3 is greatest");
}
    }
    
}
