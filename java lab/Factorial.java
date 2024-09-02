import java.util.*;
public class Factorial {
    public static void main(String[]args){

    
    int num, Fact = 1;
    Scanner S = new Scanner(System.in);
    System.out.println("Enter a number:");
    num = S.nextInt();

    for(int i =1; i<num; i++){
        Fact = Fact * i;
      
    }
    System.out.println("Factorial of" + num + " is "+ Fact);

    }
}
