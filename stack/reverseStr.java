package stack;
import java.util.*;

public class reverseStr {
    public static void main(String[] args) {
        String str="Vikas";
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        System.out.println("Original string is="+str);
        StringBuilder sb=new StringBuilder(" ");
         while(!s.isEmpty()){
           sb.append(s.peek());
            s.pop();
        
    }
       System.out.println(sb);
    }
   
    
}
