package stack;
import java.util.*;
public class NexGrEleLeft {
    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int ele[]=new int[arr.length];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){ //NEXT GREATER LEFT
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
        if(s.isEmpty()){
            ele[i]=-1;
        }
        else{
            ele[i]=arr[s.peek()];
        }
        s.push(i);

        }
        for(int i=0;i<ele.length;i++){
            System.out.print(ele[i]+" ");
        }

    }
    
}
