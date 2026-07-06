import java.util.*;
public class For_Loop_Q5 {
public static void main(String [] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int num = sc.nextInt();

    int Sum = 0 ;
    for(int i = 1 ; i<=num; i++)
    {
        Sum = Sum+i ;
    }
    System.out.println("Sum of first "+num + " natural number is : " +Sum);
}    


}
