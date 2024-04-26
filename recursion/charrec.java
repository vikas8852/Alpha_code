package recursion;

public class charrec {
    public static int sub(String str,int n,int s){
     if(n==str.length())
       return str.length()+s;
      int t=n+1;
      while(t<str.length()){
          if(str.charAt(n)==str.charAt(t))
           s++;
        t++;
      }
      return sub(str,n+1,s);
    }
    public static void main(String[] args) {
        
    String st="aba";
    System.out.println(st.substring(1)+1);
    System.out.println(sub(st,0,0));
    }
    
}
