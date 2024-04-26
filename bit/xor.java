package bit;
import java.util.*;
public class xor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(5^3); //XOR
        System.out.println(0^1);
        System.out.println(~5);
        System.out.println(5<<3); //IT simply  means 5*2**number that is shift(3)
        System.out.println(6>>2); //It simply means 6/2**number
    System.out.print("enter the number=");
      int n=sc.nextInt();
      if((n & 1)==0) //check lsb
       System.out.println("given number is even");
    else
     System.out.println("not even number");
    }
    
}
