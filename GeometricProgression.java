//The general form of terms of a GP is a, ar, ar2, ar3, and so on.
//Here, a is the first term and r is the common ratio and n is nth term.
//Example: 2,6,18,54,162,486,1458,...    where a = 2,r=3.

import java.util.*;
public class GeometricProgression
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int term = a;
        for(int i = 0; i < n; i++)
        {
            System.out.print(term+",");
            term = term*r;
        }
        
    }
}