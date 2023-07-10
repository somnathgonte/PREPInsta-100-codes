//Check Whether or Not the Number is an Abundant Number in Java.

/*
 Given an integer input, the objective is to check whether the sum of all the factors of a number 
 except the number itself is greater than the number or not. 
 Therefore, we’ll write a code to Check Whether or Not the Number is an Abundant Number in Java.

 Example
 Input : 18
 Output : Yes, it's an Abundant Number
 */

import java.util.*;
public class AbundantNumber 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int iNo1 = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=iNo1/2; i++)
        {
            if(iNo1%i==0)
            {
                sum = sum+i;
            }
        }
        if(sum>iNo1)
        {
            System.out.println(iNo1+" is a Abundant Number.");
        }
        else
        {
            System.out.println(iNo1+" is not a Abundant Number.");
        }
    } 
}
