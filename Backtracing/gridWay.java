package Backtracing;

public class gridWay {
    public static int way(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){ //cond for last call
            return 1;
        }
        else if(i==n || j==m)
         return 0;
       int w1=way(i+1,j,n,m);
       int w2=way(i, j+1, n, m);
       return w1+w2;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(way(0,0,n,m));
    }
    //TIME COMPLEXITY O(2**(n+m))
}
