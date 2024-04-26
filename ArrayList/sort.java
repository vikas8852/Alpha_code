package ArrayList;
import java.util.*;
public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList();
        l1.add(9);
         l1.add(1);
          l1.add(7);
           l1.add(3);
            l1.add(5);
            System.out.println(l1);
           Collections.sort(l1);//ACCENDING ORDER
           System.out.println(l1);
           Collections.sort(l1,Collections.reverseOrder());
           System.out.println(l1);

    }
    
}
