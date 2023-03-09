/*
Check if the year variable is divisible by 400.
Check if the year variable is divisible by 4 but not by 100.
If the above conditions are satisfied, print it’s a Leap year. It’s not a Leap Year otherwise.

Example
Input : 2100
Output: Not Leap Year
*/

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
             System.out.println(year+" is leap year");
          }
          else
          {
             System.out.println(year+" is a not leap year");
          }
       }  
    }
}
