import java.lang.*;
import java.util.*;

public class LeapYear
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting year: ");
        int startYear = sc.nextInt();
        System.out.println("Enter ending year: ");
        int endYear = sc.nextInt();

        int count=0;

        for(int year=startYear; year<=endYear; year++)
        {

            if((year%4==0 && year%100!=0)||(year%400==0))
            {
                System.out.println(year);
                count++;

            }
            // count++; 
      }  
      System.out.println("=======!=======");

      System.out.println(count);
    }
}
