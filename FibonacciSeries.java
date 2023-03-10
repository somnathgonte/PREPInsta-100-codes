//Find the Fibonacci Series up to Nth Term in Java
//Example: 
//Input: 8
//Output: 0 1 1 2 3 5 8 13

import java.util.Scanner;
public class FibonacciSeries
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ranges : ");
        int n = sc.nextInt();

        int a=0,b=1;
        for(int i = 0; i < n; i++)
        {
            int c = a+b;
            System.out.print(a+" ");
            a = b;
            b = c;
        } 
    }
}