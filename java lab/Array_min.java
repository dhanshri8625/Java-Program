import java.util.*;
public class Array_min {
    public static void main(String[]args){

        int i=0,Min=0;
        
         
        int num[]=new int[]{90,90,65,78,54,87};

        Min = num[0];

        for(i=0;i<num.length;i++){
            if((i==0)||num[i]<Min){
                Min=num[i];
            }
        }
        System.out.println("Minimum no is"+Min);
    }
    
}
