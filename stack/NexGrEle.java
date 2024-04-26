package stack;
import java.util.*;

public class NexGrEle {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();    //next greater right
        int nxtGre[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){  //
            //while
         while(!s.isEmpty() && arr[s.peek()]<= arr[i]){
                s.pop();
            }
            // if-else
        if(s.isEmpty()){
                nxtGre[i]=-1;
             }
        else{
                nxtGre[i]=arr[s.peek()];
            }
            //3 push in a
            s.push(i);
        }
        for(int i=0;i<nxtGre.length;i++){
            System.out.print(nxtGre[i]+" ");
        }
        System.out.println();
    }
    
}
//Other question that can be construct from same algo
          
        //Next Greater Right
        //Next Greater Left
        //Next Smaller Right
        //Next Smaller Left 
