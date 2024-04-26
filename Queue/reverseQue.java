package Queue;
import java.util.*;
public class reverseQue {
    public static void reverse(Queue q){
        Stack s=new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
         while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
         }
    }
    public static void main(String[] args) {
        Queue q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        reverse(q);
    }
}
