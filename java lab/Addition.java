import java.util.*;
public class Addition
{
    public static void main(String[]args)
    {

        int N1 = 0, N2 = 0, Add = 0;
        Scanner S = new Scanner(System.in);

        System.out.print("Enter First Number :");
        N1 = S.nextInt();
        System.out.print("Enter Second Number :");
        N2 = S.nextInt();

        Add = N1 + N2;
        System.out.println("Addition is " + N1 +" and " + N2 +" is : " + Add +".");

    }
}