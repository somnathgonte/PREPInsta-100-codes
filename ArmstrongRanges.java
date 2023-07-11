// Find the Armstrong Numbers in a given Interval in Java.

/*
  Given two integers high and low for limits as inputs, the objective is to write a code to Find the Armstrong Numbers in a given Interval in Java.

  Example :
  Input : 10 1000
  Output : 153  370  371  407
  
 */


import java.util.*;
public class ArmstrongRanges 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Ranges : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        for(int i=start; i<=end; i++)
        {
            int temp = i;
            int count=0;
            int sum =0;

            //Calculate Number of digit.
            while(temp != 0)
            {
                int rem = temp % 10;
                count++;             //count----number of digit
                temp /= 10;
            }

            // Calculate the sum of digits raised to the power of count
            temp = i;
            while(temp !=0 )
            {
                int rem=temp%10;
                int power = 1;
                for(int j=1; j<=count; j++)
                {
                    power = power*rem;
                }
                sum = sum+power;
                temp /= 10;
            }

            // Check if i is an Armstrong number
            if(i==sum)
            {
                System.out.println(i);
            }
        } 
    }
}
