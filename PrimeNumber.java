/*
A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.
A natural number greater than 1 that is not prime is called a composite number. 
For example, 5 is prime because the only ways of writing it as a product, 1 × 5 or 5 × 1, involve 5 itself.

Example
Input : 23
Output : Prime
*/

import java.util.*;
public class PrimeNumber
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int iNo1 = sc.nextInt();
        checkPrime(iNo1);
    }

    public static void checkPrime(int num)
    {
       if(num==0 || num==1)
       {
        System.out.println("not prime");
       }
       else
       {
       boolean check = true;
       for(int i = 2; i <= num/2; i++)
       {
        if(num%i==0)
        {
            check = false;
            break;
        }
       } 
       if(check == false)
       {
        System.out.println("Not prime");
       }
       else 
       {
        System.out.println("Prime");
       }
      }
    }
}
