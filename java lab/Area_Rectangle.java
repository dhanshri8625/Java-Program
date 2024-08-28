import java.util.*;
public class Area_Rectangle {
    public static void main(String[]args)
    {
        double height, width = 0, area = 0;

        Scanner S = new Scanner(System.in);

        System.out.print("Enter Height : ");
        height = S.nextDouble();

        System.out.print("Enter Width : ");
        width = S.nextDouble();




        area = height * width;
        
        System.out.print("Area of Reactangle is  " + area);
    
    }
}
