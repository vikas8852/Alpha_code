package HashMap;
import java.util.*;
public class linkedhash {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");    //it mentain the order in which it added
        lhs.add("Beng");
      //  System.out.println(lhs);

        // for(String s:lhs){
        //     System.out.println(s);
        // }
        TreeSet<String> ts=new TreeSet<>();   //it mentain the alphabetical order
        ts.add("Delhi");   
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Beng");

        for(String s:ts){
            System.out.println(s);
        }
        System.out.println(ts);

    }
    
}
