import java.util.*;
public class While_Loop_Q4 {
    public static void main (String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the Number ");
int number = sc.nextInt();

int sum = 0;
int count = 1 ;
while(count <= number)
{
    sum = sum + count ;
    count++;
}
System.out.println("The sum of the N Natural number Till " +number +" is = " +sum);
    }
    
}
