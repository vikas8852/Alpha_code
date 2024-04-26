package HashMap;
import java.util.*;
public class hash_Set {
    public static void main(String[] args) {

        HashSet<Integer>hs=new HashSet<>(); //no duplicate,unordered,null is allowed
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        if(hs.contains(2))
         System.out.println( "set contain 2"); //contains method
        if(hs.contains(3)){
            System.out.println("set contains 3");
        }
        hs.clear();                   //clear method
        System.out.println(hs.size()); //size method
        System.out.println(hs.isEmpty());  //empty method

        
    }
    
}
