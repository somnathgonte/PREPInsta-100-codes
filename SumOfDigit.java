/* 
Example
Input : 1234
Output : 1 + 2 + 3 + 4 = 10
*/

import java.util.*;
public class SumOfDigit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int iNo1 = sc.nextInt();

        int sum =sumOfDigit(iNo1);
        System.out.println("The sum of digit of "+iNo1+" is :"+sum);
    }

    public static int sumOfDigit(int num)
    {
        int sum = 0;
        while(num != 0)
        {
            int rem = num%10;
            sum=sum+rem;
            num /= 10;
        }
        return sum;
    }
}