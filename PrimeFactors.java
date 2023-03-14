/* 
Input : 12
Output : 2 2 3
*/

import java.util.*;
public class PrimeFactors
{
    public static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int iNo1 = sc.nextInt();

        for(int i = 2; i <= iNo1/2; i++)
        {
            if(iNo1%i==0)
            {
                if(i == 2 || i%2 != 0)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
