import java.util.*;
public class Days_week
 {
    public static void main(String[]args)
    {
        int Days = 0 ;
        Scanner S = new Scanner(System.in);

        System.out.println("Enter Days number(1-7) : ");
        Days = S.nextInt();

        if(Days < 0 || Days > 7)
        {
            System.out.println("Invalid");
        }
        else if(Days == 1){
            System.out.println("Monday");
        }
        else if(Days == 2){
            System.out.println("Tuesday");
        }
        else if(Days == 3){
            System.out.println("Wednesday");
        }
        else if(Days == 4){
            System.out.println("Thursday");
        }
        else if(Days == 5){
            System.out.println("Friday");
        }
        else if(Days == 6){
            System.out.println("Saturday");
        }
        else if(Days == 6){
            System.out.println("Sunday");
        }
    }
    
}
