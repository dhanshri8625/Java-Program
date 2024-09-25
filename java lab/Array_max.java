import java.util.*;
public class Array_max{
    public static void main(String[]args){

        int i =0, Max =0;

        int num[]=new int[]{2,3,4,5,6,7};

        Max = num[0];
        for(i=0;i<num.length;i++){
            if(num[i]>Max){
                Max = num[i];

            }
        }
        System.out.println("Maximum number is"+Max);
            
        }

    }
