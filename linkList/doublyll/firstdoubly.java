package linkList.doublyll;

public class firstdoubly {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add

    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        //
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
             temp=temp.next;
           
        }
        System.out.println("null");

    }
    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
            
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        return val;
    }
    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args) {
        firstdoubly dll=new firstdoubly();
        dll.addFirst(3);
        dll.addFirst(6);
        dll.addFirst(5);
        dll.print();
    //    System.out.println(dll.removeFirst());
     //   dll.removeFirst();
     //   dll.removeFirst();
     //   dll.print();
     dll.reverse();
     dll.print();

        
    }
    
}
