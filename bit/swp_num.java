package bit;
import java.util.*;
public class swp_num {
    public static void main(String[] args) {
        //This program swap the two number with using thrid variable
      Scanner sc=new Scanner(System.in);
      System.out.print("enter the first number=");
      int A=sc.nextInt();
     System.out.print("enter the second number=");
      int B=sc.nextInt();
    System.out.println("value of A before swap is ="+A);
    System.out.println("value of B before swap is ="+B);
    A=A^B;
    B=A^B;
    A=A^B;
    System.out.println("After Swaping!!!!");
    System.out.println("value of A before swap is ="+A);
    System.out.println("value of B before swap is ="+B);

    
      
      

    }
    
}
