import java.util.*;
public class kilometer{
    public static void main(String[]args){
        double kilometer = 0, Meter = 0;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the distance in kilometer: ");
        kilometer = S.nextDouble();

        Meter  = kilometer * 1000 ;
        System.out.print("Distance in Meter is :" + Meter);



    }

}