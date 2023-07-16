//Number : 145678

//Output : Even Count = 3. Odd Count=3;

import java.util.*;
public class CountEvenOdd
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int iNo1 = sc.nextInt();

        int eCount = 0;
        int oCount = 0;

        while(iNo1 != 0)
        {
            int rem = iNo1 % 10;

            if(rem % 2==0 || rem == 2)
            {
                eCount++;
            }
            else 
            {
                oCount++;
            }

            iNo1 /= 10;
        }

        System.out.println("Even Count is :"+eCount);
        System.out.println("Odd Count is :"+oCount);
    }
}