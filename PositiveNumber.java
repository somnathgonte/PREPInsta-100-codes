/*
N > 0 then, number is Positive.
N < 0 then, number is Negative.
N = 0 then, number is Zero.


Example
Input : num = 11
Output : Positive
*/

import java.lang.*;
import java.util.*;

public class PositiveNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int iNo1 = sc.nextInt();

        if(iNo1 > 0)
        {
            System.out.println(iNo1+" is positive number.");
        }
        else
        {
            System.out.println(iNo1+" is negative number.");
        }
        
    }
}
