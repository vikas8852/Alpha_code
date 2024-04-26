package recursion;

public class stringlen {
    public static int length(String s,int i ,int l){
        if(s.charAt(i)==' ')
         return 1;
        else
         l++;
        length(s,i=i+1,l);
        return l;
    }
    public static void main(String[] args) {
        System.out.println(length("abcd",0,0));
        
    }
    
}
