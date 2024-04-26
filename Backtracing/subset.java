package Backtracing;

public class subset {
    public static void  subSet(String str,String ans,int i){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //Yes choice
        subSet(str,ans+str.charAt(i),i+1);
        // No choice
        subSet(str, ans, i+1);

    }
    public static void main(String[] args) {
        subSet("abc"," ",0);
        
    }
    
}
