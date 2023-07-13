// Write a Java Program to swap two numbers using the third variable.

import java.util.*;
public class SwapNumber 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int x,y,temp;
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before swapping : "+x+" "+y);
        
        temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping : "+x+" "+y);

    }
}
