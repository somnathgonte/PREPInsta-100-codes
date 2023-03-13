/* 
    Find the Power of a Number in Java.
    Example
    Input : 2 3
    Output : 8
*/
import java.util.*;
public class Power 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value:");
        int base = sc.nextInt();
        System.out.println("Enter raise value:");
        int raise = sc.nextInt();

        int power = 1;
        for(int i=1; i<=raise; i++)
        {
            power=(power*base);
        }
        System.out.println("Power = "+power);
    }
}
