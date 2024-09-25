import java.util.*;
public class Array_User_Max 
{
    public static void main(String[]args)
    {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the number of array:");
        int num = S.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter the element of the array:");

        for(int i=0;i<num;i++)
        {
            arr[i] = S.nextInt();
        }

        int Max = arr[0];

        for(int i=0;i<num;i++)
        {
            if (arr[i] > Max){
                Max = arr[i];

            }
        }

        System.out.println("The minimum element of the array is:"+Max);
    }
    
}
