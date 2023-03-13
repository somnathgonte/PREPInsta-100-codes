/*
Java Program to find palindrome or not.
Example
Input : 121
Output : Palindrome
*/

import java.util.*;
public class Palindrome 
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
            reverse = (reverse * 10)+ rem;
            iNo1 /= 10;
        }
        if(temp==reverse)
        {
            System.out.println(temp+" is a Palindrome number.");
        }
        else 
        {
            System.out.println(temp+" is not palindrome number.");
        }
    }
}
