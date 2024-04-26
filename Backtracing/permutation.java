package Backtracing;

public class permutation {
    public static void permut(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newstr=str.substring(0,i)+str.substring(i+1);//REmoving the element that are selected above
            permut(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        permut("abc", " ");
        
        //TIME COMPLEXITY----
        // O(N*N!)
        
    }
    
}
