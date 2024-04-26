package linkList.doublyll;
import java.util.*;
public class circular {
    public class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;
        }



    }
    public static Node head;
  public void addFirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        newNode.next=head;

    }
  }

    public static void main(String[] args) {

    

        
    }

}
