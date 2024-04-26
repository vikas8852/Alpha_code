package leetcode;

public class revers151 {
    public static void main(String[] args) {
        String s="the sky is  blue";
        String s1="the sky is blue";
        String s2[]=s.trim().split("\s+");
        
        System.out.println(s.trim().split("\\s+"));
        System.out.println(s2[3]);
        String w[]=s.split("\\s+");
       for(String i:w)
        System.out.println(i);
    }
    
}
