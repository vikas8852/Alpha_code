package String;
import java.util.*;
public class test {
    public static void main(String[] args) {
      int [] arr={1,3,5};
        String s="vika   s       h";
        String t="one.two.three";
        String x="Hello, this is ram";
        
      //  s.split("/");
      //  System.out.println(s.charAt(s.length()-1));
      String st= Arrays.toString(arr);
      // System.out.println(s==t);
      // System.out.println(st.charAt(2));
      // System.out.println(st);
      
      System.out.println(x.split(" ").length);
     // System.out.println(s.replaceAll("\\s", ","));
     for(String c:t.split("."))
       System.out.println(c);
    }
}
