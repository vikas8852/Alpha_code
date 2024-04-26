package HashMap;
import java.util.*;
public class linkhashmap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("China",150);
        lhm.put("India",100);
        lhm.put("Us",50);
        lhm.put("USA",30);

        System.out.println(lhm);
    }
    
}
