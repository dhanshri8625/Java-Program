import java.util.*;
public class Days 
{
    public static void main(String[]args)
    {

    int days = 0 ;
    String dayString;
        Scanner S = new Scanner(System.in);

        System.out.print("\n Enter First Number:");
        days = S.nextInt();

        switch(days)
        {
            case 1:
                   dayString = ("Monday");
                   break;
            case 2:
                   dayString = ("Tuesday");
                   break;
            case 3:
                   dayString = ("Wednesday");
                   break;
            case 4:
                   dayString = ("Thursday");
                   break;
            case 5:
                   dayString = ("Friday");
                   break;
            case 6:
                   dayString = ("Saturday");
                   break;
            case 7:
                   dayString = ("Sunday");
                   break;
            default:
                    dayString = ("Invalid");

        }
        
        System.out.println(dayString);                        

        }

}

