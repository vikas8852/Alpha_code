package bit;
import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number=");
        int n=sc.nextInt();
        if((n&(n-1))==0){
            System.out.println("given number is power of 2");
        }
        else
         System.out.println("Not power of two");
    }
    
}
