import java.lang.*;
import java.util.*;

public class Greter 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int iNo1 = sc.nextInt();
        int iNo2 = sc.nextInt();
        int iNo3 = sc.nextInt();

         if(iNo1 > iNo2 && iNo1 > iNo2)
         {
             System.out.println(iNo1);
         }
         else if(iNo2 > iNo1 && iNo2 > iNo3) 
         {
            System.out.println(iNo2);
         }
         else 
         {
             System.out.println(iNo3);
         }
    }
    
}
