package ArrayList;
import java.util.*;

public class monotono {
    public static boolean check(ArrayList<Integer> a1){
        
         boolean inc=true;
         boolean dec=true;
         for(int i=0;i<a1.size()-1;i++){
            if(a1.get(i)>a1.get(i+1))
             inc=false;
            if(a1.get(i)<a1.get(i+1))
             dec=false;
         }

         return inc||dec;
     
        }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1 =new ArrayList<>();
        System.out.println("Enter the element of Arryalist");
         for(int i=0;i<5;i++){
            System.out.println("enter: ");
            int a=sc.nextInt();
            a1.add(a);
         }
     boolean result=check(a1);
     if(result)
      System.out.println("Monotonic");
    else
     System.out.println("Not Monotonic");


    }
    
}
