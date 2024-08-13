import java.util.*;
public class Even_or_odd
 {
    public static void main(String[]args)
    {

        int Num = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("\n Enter first number:");
        Num = S.nextInt();

        if(Num % 2 == 0)
        {
            System.out.println("Enter number is even.");
        }
        else
        {
            System.out.println("Enter number is odd.");
        }
    }
}
