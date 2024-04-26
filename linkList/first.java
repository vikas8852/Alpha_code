package linkList;

public class first { 
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

  
  public static void addfirst(int data){  //time complexity O(1)
    //step-1 create new node
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    //step2
    newNode.next=head;
    //step3 - head=newNode
    head=newNode;

  }
  public void addLast(int data){
      Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;

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
  public static void addMiddle(int data,int idx){
    if(idx==0){
        addfirst(data);
        return;
    }
    Node newNode=new Node(data);

    Node temp=head;
    int i=0;
    while(i<idx-1){
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next=newNode;


  }
  public int removefirst(){
   int size=findSize();
    if(size==0){
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;

    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        return val;
    }
    int val=head.data;
    head=head.next;
    return val;
  }
  public static int findSize(){
    Node temp=head;
    int size=0;
    while(temp!=null){
        size++;
        temp=temp.next;
    }
    return size; 

  }
  public int  removelast(){
    int size=findSize();
    if(size==0){
     System.out.println("LL is empty");
     return Integer.MIN_VALUE;
    }
    else if(size==1){
        int value=head.data;
        head=tail=null;
        return value;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;

    }
    int value=prev.next.data;
    prev.next=null;
    tail=prev;
    return value;
  }
  public int itrSearch(int key){ 
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key)
         return i;
        temp=temp.next;
        i++;
    }
    return -1;
  }
  public int helper(Node head,int key){
    if(head==null){
        return -1;
    }
    if(head.data==key){
        return 0;
    }
    int idx=helper(head.next,key);
    if(idx==-1)
     return -1;
    return idx+1;
  }
  public int recSearch(int key){
    return helper(head,key);
  }
  public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;
  }
  public boolean iscycle(){
    Node slow =head;
    Node fast=head;

     while(fast!=null && fast.next!=null){
      slow=slow.next; //+1
      fast=fast.next.next; //+2
       if(slow==fast)
        return true; //cycle exists
     }
     return false;  //cycle does'nt exists
  }
  public static void removeCycle(){
    //detect cycle
    Node slow =head;
    Node fast=head;
    boolean cycle=false;

     while(fast!=null && fast.next!=null){
      slow=slow.next; //+1
      fast=fast.next.next; //+2
       if(slow==fast){
        cycle= true;    //cycle exists
        break;
    
    }

    }
     if(cycle==false)
      return ;
      
    //find meeting point
    slow=head;
    Node prev=null;
    while(slow!=fast){
      prev=fast;
      slow=slow.next;
      fast=fast.next;

    }//remove cycle ->last.next=null
    prev.next=null;

  }
  public static  void deleteAlternate (){
    Node slow=head;
   slow.next=slow.next.next;
   System.out.println(slow.data);
   slow=slow.next;
    System.out.println(slow.data);


   
  }
public static void main(String[] args) {
    
    first ll=new first();
    // ll.print();
    // ll.addfirst(1);
    // ll.print();
    // ll.addfirst(2);
    // ll.print();
    // ll.addLast(3);
    // ll.addMiddle(10,2);
    // ll.addLast(4);
    // ll.print();
   
    // System.out.println(findSize());
    // ll.removefirst();
    // ll.print();
    // System.out.println(findSize());
    // ll.print();
    // System.out.println( "value="+ ll.removelast());
    // ll.print();
    //   System.out.println(findSize());
    //   System.out.println("key is found at index = "+ll.itrSearch(3));
    //   System.out.println(ll.recSearch(3));
    //   ll.print();
    //   ll.reverse();
    //   ll.print();
    // head=new Node(1);
    // Node temp=new Node(2);
    // head.next=temp;
    // head.next.next=new Node(3);   //1->2->3->2
    // head.next.next.next=temp;
    // System.out.println(ll.iscycle());
    // ll.removeCycle();
    // System.out.println(ll.iscycle());

    ll.addfirst(6);
    ll.addfirst(5);
    ll.addfirst(4);
    ll.addfirst(3);
    ll.addfirst(2);
    ll.addfirst(1);
     ll.print();
     ll.deleteAlternate();
     ll.print();
  //  System.out.println( ll.findSize());
  //  ll.removelast();
  //    ll.print();  
   

}
    
}
