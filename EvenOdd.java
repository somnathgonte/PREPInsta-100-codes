import java.lang.*;
import java.util.*;
public class EvenOdd
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int iNo1 = sc.nextInt();

        String ans =iNo1%2==0 ? "It is even number." : "It is odd Number.";

        System.out.println(ans);   
    }
}