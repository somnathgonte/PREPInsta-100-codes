/* 
    Example:
    Input : 123
    Output : 321
*/

import java.util.*;
public class ReverseNumber 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int iNo1 = sc.nextInt();
        int temp = iNo1;
        int reverse = 0;

        while(iNo1 != 0)
        {
            int rem = iNo1 % 10;

            reverse = (reverse * 10)+rem;

            iNo1 /= 10;
        }
        System.out.print("Reverse of "+temp+" is :"+reverse);
    }
}
