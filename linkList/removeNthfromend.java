 package linkList;

public class removeNthfromend {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;

        
    }
    public static void print(){
        if(head==null){
         System.out.println("LinlList is empty");
          return;
      }
      Node temp=head;
      while(temp!=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
       }
       System.out.println("null");
    }
    public void deleteNfromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        System.out.println("size is"+ size);
        if(n==size){
            head=head.next; //removeFirst
            return;
        }
        //size-n
        int i=1;
        int iToFind=size-n;
        Node prev =head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;

    }
    public Node findMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        removeNthfromend ll=new removeNthfromend();
        ll.addFirst(4);
        ll.addFirst(7);
        ll.addFirst(9);
        ll.addFirst(6);
        ll.addFirst(2);
        ll.addFirst(5);
        ll.print();
        ll.deleteNfromEnd(2);
        ll.print();
        System.out.println(ll.findMid().data);
        

    }
}
