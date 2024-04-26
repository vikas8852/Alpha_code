package Queue;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addLast(6);
       
        System.out.println(d);
         d.removeFirst();
         d.addLast(7);
         d.addFirst(2);
         System.out.println(d);
         System.out.println("firsr el "+d.getFirst());
         System.out.println("last el "+ d.getLast());
    }
    
}
