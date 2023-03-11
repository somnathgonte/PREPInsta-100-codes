import java.util.*;
public class Factors
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int iNo1 = sc.nextInt();

        System.out.print("Factors of "+iNo1+" is : ");

        for(int i = 1; i < iNo1; i++)
        {
            if(iNo1%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}