//Prime number program

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