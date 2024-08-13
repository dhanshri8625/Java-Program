import java.util.*;
public class Table {
    public static void main(String[]args){
        int Num = 0, i = 1;
        Scanner S = new Scanner(System.in);
  
        System.out.println("enter a  number:");
        Num = S.nextInt();
         
        //while(i <= 10){
            for(i=0;i<=10;i++){
            System.out.println(Num + "*" + i + "=" + Num*i);
            //i++;
        }
    }
}
    
//}
