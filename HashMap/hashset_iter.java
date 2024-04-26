package HashMap;
import java.util.*;
public class hashset_iter {
    public static void main(String[] args) {
        HashSet<String> city=new HashSet<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Noida");
        city.add("Beng");

        // Iterator it=city.iterator();   //FOR ITERATING  HASHSET -1 method
        // while(it.hasNext()){   
        //     System.out.println(it.next());
        // } 
        for(String ss:city)
         System.out.println(ss);    // for ITERATING HASHSET -2 method

       System.out.println(city);
    }
    
}
