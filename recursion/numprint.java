package recursion;
import java.util.*;
public class numprint {
    public void inc(int n){
        if(n==1){
        System.out.print(n+" ");
         return ;}
        dec(n-1);
        System.out.print(n+" ");
    } 
    public void dec(int n){
        if(n==1){
         System.out.print(n+" ");
         return;
        }
        System.out.print(n+" ");
        inc(n-1);

    }
    public int fact(int n){
        if(n==1)
         return 1;
        return(n*fact(n-1));

    }
    public int sum(int n){
        if(n==1)
         return 1;
        return(n+sum(n-1));
    }
    public static void main(String[] args) {
        numprint aa=new numprint();
        //aa.dec(10);
      //  aa.inc(10);
      //  System.out.println(aa.fact(5));
        System.out.println(aa.sum(20));

    }
    
}
