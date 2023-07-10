//Check Whether or Not the Number is an Harshad number.

/*
Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.

Example :

1.Suppose a number 24 .
2.Calculate the sum of digits of the number (2 + 4) = 6 .
3.Check whether the number entered by user is completely divisible by sum of its digits or not.

Below are first few Harshad Numbers represented in base 10 :
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
*/

import java.util.*;
public class HarshadNumber 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int iNo1 = sc.nextInt();
        int temp = iNo1;
        int sum = 0;

        while(iNo1 != 0)
        {
            int rem = iNo1 %10;

            sum = sum + rem;

            iNo1 /= 10;
        }

        if(temp % sum == 0)
        {
            System.out.println(temp+" is a Harshad number.");
        }
        else
        {
            System.out.println(temp+" is not a Harshad number.");

        }
    }
    
}
