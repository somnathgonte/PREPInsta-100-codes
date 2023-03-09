/*
Example
Input : num = 5
Output : 15

Where first 5 number is 1, 2, 3, 4, 5
Sum of numbers = 1 + 2 + 3 + 4 + 5 = 15

*/

import java.lang.*;
import java.util.*;

public class SumOfNatural 
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int iNo1 = sc.nextInt();
        int iNo2 = sc.nextInt();
        sum(iNo1,iNo2);      //method calling
        System.out.println(sum(iNo1,iNo2));
    }

    public static int sum(int num1,int num2)
    {
        int sum = 0;
        for(int i = num1; i <= num2; i++)
        {
            sum = sum+i;
        } 
        return sum;
    }
    
}
