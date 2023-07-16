import java.util.*;
public class GenerateRandomNumber 
{
    public static void main(String[] args) 
    {
        Random rand = new Random();

        int randomNumber = rand.nextInt(10);
        System.out.println(randomNumber);
        
    }
    
}
