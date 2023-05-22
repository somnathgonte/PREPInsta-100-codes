// Check Whether or Not the Number is a Perfect Number in Java

// Example
// Input : 6
// Output : Yes, It's a Prefect Number
// Explanation : Number = 6
// Factors of 6 except 6 are 1, 2 and 3. 
// When we add the three we get 6 itself. Therefore, it's a Perfect Number.

import java.util.*;
public class PerfectNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int no = sc.nextInt();
        int sum=0;
        int temp=no;

        for(int i=1; i<=no/2; i++)
        {
            if(no%i==0)
            {
                sum=sum+i;
            }
        }
        if(temp==sum)
        {
            System.out.println(temp+" is a Perfect number: ");
        }
        else 
        {
            System.out.println(temp+" is not a Perfect number.");
        }  
    }
}
