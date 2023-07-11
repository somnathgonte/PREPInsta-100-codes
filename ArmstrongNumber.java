// Check whether or Not the Number is an Armstrong Number in Java.

/*
  Armstrong Numbers.

  Input : 371
  Output : It's an Armstrong Number.
  Explanation: 371 = 3^3 + 7^3 + 1^3
  Therefore it's an Armstrong number.
  Example
 */

 import java.util.*;
public class ArmstrongNumber 
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int iNo1 = sc.nextInt();
        int temp = iNo1;
        int temp2 = iNo1;
        int count=0;

        while(iNo1 != 0)
        {
            int rem = iNo1%10;
            count++;
            iNo1 /= 10;
        }
        int sum =0;

        while(temp != 0)
        {
            int rem = temp % 10;

            int power=1;
            for(int i=1; i<=count; i++)
            {
                power = power*rem;
            }
            sum = sum+power;
            temp /= 10;
        }
        
        if(temp2==sum)
        {
            System.out.println(temp2+" is a Armstrong Number");
        }
        else 
        {
            System.out.println(temp2+" is not a Armstrong Number");
        }
    }   
}
