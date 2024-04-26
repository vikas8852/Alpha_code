package ArrayList;
import java.util.*;

public class cont_water {
    public static void main(String[] args) {
       int ht[]={1,8,6,2,5,4,8,3,7};
       int max=-1;
      
         for(int i=0;i<ht.length;i++){
            for(int j=i+1;j<ht.length-1;j++){
             int min=Math.min(ht[i],ht[j]);
             int width=j-i;
             int hold=width*min;
             if(hold>max)
              max=hold;
             


            }

         }
         System.out.println(max);

    }
    
}
