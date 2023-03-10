// The example of A.P. is 3,6,9,12,15,18,21,.....

import java.util.*;
public class Ap
{
    public static void main(String []arg)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int term = a;

        for(int i = 0; i < n; i++)
        {
            System.out.print(term+",");
            term = term + d;
        }
    }
}