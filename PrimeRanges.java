//Java Program to print Prime numbers in a given range.
/*
Example
Input : 2 10
Output : 2 3 5 7 
 */

import java.util.*;
public class PrimeRanges
{
   public static void main(String[] args) 
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter start number: ");
    int startNumber = sc.nextInt();
    System.out.print("Enter end number: ");
    int endNumber = sc.nextInt();
    System.out.println("Prime number between "+startNumber+" and "+endNumber+" :");

    for(int i = startNumber; i < endNumber; i++)
    {
        int j = 0;

        for(j = 2; j < i; j++)
        {
            if(i%j==0)
            {
                break;
            }
        }
        if(j==i)
        {
            System.out.println(i);
        }
    }
   }  
}
