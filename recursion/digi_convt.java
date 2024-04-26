package recursion;
import java.util.*;
public class digi_convt {
    public static void convert(int n,int rem ,String[]arr){
        if(n==0)
         return;
        convert(n=n/10,n%10,arr);
        System.out.print(arr[rem]+" ");
        
       
      

                

    }
    public static void main(String[] args) {
         String []digit={"zero","one","two","three","four","five","six","seven","eight","nine"};
        int a=1109;
       
        convert(a,a%10,digit);
        
    }
    
}
