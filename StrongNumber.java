//Check Whether or Not the Number is a Strong Number in Java

// Example
// Input : 145
// Output : Yes, it's a strong number
// Explanation : Number = 145
// 145 = 1! + 4! + 5!
// 145 = 1 + 24 + 120
// output number  = 145.

import java.util.*;
public class StrongNumber
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int no= sc.nextInt();
        int temp = no;
        int sum=0;

        while(no != 0)
        {
            int rem = no%10;
            int facto=1;
            for(int i=1; i<=rem; i++)
            {
                facto=facto*i;
            }

            sum = sum+facto;
            no/=10;
        }
        if(sum==temp)
        {
            System.out.println(temp+ " is a strong number.");
        }
        else 
        {
            System.out.println(temp+" is not a strong number.");
        }
        
    }
}