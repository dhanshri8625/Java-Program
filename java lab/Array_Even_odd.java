import java.util.*;
public class Array_Even {
    public static void main(String[]args)
    {

        int num[]={2,3,4,5,6,7};

        
        System.out.println("Even numbers in the array:");
        for(int i = 0;i < num.length; i++){
            if (num[i] % 2 == 0){

                System.out.println(num[i]);
            }
        }

            
        System.out.println("Odd numbers in the array:");
        
        for(int i = 0;i < num.length; i++){
            if (num[i] % 2 != 0){
                System.out.println(num[i]);
            }
        }
    }

}

