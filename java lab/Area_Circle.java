import java.util.*;
public class Area_Circle {
    public static void main(String[]args)
    {
        double pi = 3.14, r = 0, area = 0;

        Scanner S = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        r = S.nextDouble();

        area = pi * r *r;

        System.out.print("Area of circle is " + area);

    }
    
}
