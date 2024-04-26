package HashMap;
import java.util.*;

public class haashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>(); //its just like python dictoniary
        //Insert--O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        System.out.println(hm);
        //size
        System.out.println("size="+hm.size());

        //to check empty
        System.out.println(hm.isEmpty());

        //Get - O(1)
        int population=hm.get("India");
        System.out.println(population);
        System.err.println(hm.get("Russia"));//if not present then return null

        //Remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);
        
        //clear
        hm.clear();
        System.out.println(hm);
    }
}
