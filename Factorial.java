/*
factorial of n (n!) = 1 * 2 * 3 * 4....n

Note : 0! = 1 and 1! = 1

Example : 
5! = 1 * 2 * 3 * 4 * 5 = 120
*/


import java.util.*;
public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int iNo1 = sc.nextInt();
        int factorial=1;
        for(int i=iNo1; i > 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println(factorial);  
    }
}
