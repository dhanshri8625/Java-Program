import java.util.*;
import java.lang.*;
public class Array_07 
{
    public static void main(String[]args)
    {
        int i = 0;
        int[] Num = new int[5];
        Scanner S = new Scanner(System.in);

        //Displaying Null Array
        for(i = 0; i < 5; i++)
        {
            System.out.println("\n Values of Elements :" + (i + 1) + "=" + Num[i] +".");
           
        }

        //Accepting Array Elements from user
        for(i = 0; i < 5; i++)
        {
            System.out.println("\n Enter values for Element" + (i + 101) +":" );
            Num[i] = S.nextInt();

        }
        System.out.println("\n Entered Values in Array are => \n");
        //Displaying Array with new values

        for(i = 0; i < 5; i++)
        {
            System.out.println("\n Values of Elements :" + (i + 1) + "=" + Num[i] +".");
           
        }
        System.out.println("\n\n Thak you...");

    }
    
}
