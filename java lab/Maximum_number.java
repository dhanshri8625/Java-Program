import java.util.*;
public class Maximum_number
{
    public static void main(String[]args)
    {
        int N1 = 0, N2 = 0;
        Scanner S = new Scanner(System.in);
        
        System.out.print("Enter first number :");
        N1 = S.nextInt();
        System.out.print("Enter second number :");
        N2 = S.nextInt();

        if(N1 == N2)
        {
            System.out.println(N1 + "and" + N2 + "is Same");
        }
        else if(N1 > N2)
        {
            System.out.println(N1 + " is maximum of " + N2 );
        }
        else
        {
            System.out.println(N2 + " is maximum of " + N1 );
        }

    }
}