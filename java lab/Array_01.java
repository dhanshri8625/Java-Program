import java.lang.*;
public class Array_01
{
    public static void main(String[]args)
    {
        //Declare and initialize an array
        int[] numbers ={20,40,60,80,100};

        //Print array length
        System.out.println("\n Array Length:" + numbers.length +"\n");

        //Access and print each element
        for(int i = 0; i < numbers.length; i++){
            System.out.println("\t Element at index " + i +":"+ numbers[i]);


        }

     }
     
}