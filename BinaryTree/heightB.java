package BinaryTree;

public class heightB {
     static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
     }
     public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        return Math.max(lh,rh)+1;
     }
     public static int count(Node root){
        if(root==null){
            return 0;
        }
        int lc=count(root.left);
        int rc=count(root.right);
        return lc+rc+1;
     }
     public static int sum(Node root){
        if(root==null){
            return 0;

        }
        int ls=sum(root.left);
        int rs=sum(root.right);
        return ls+rs+root.data;
     }
     public static void klevel(Node root,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.print(root.data+" ");
        }
        klevel(root.left,level+1,k);
        klevel(root.right,level+1,k);
    }
      public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDim=diameter(root.left);
        int leftHt=height(root.left);
        int rightDim=diameter(root.right);
        int  rightHt=height(root.right);
        int selfDim=leftHt+rightHt+1;
        return Math.max(selfDim,Math.max(leftDim,rightDim));
      }
      public static int kAncestor(Node root,int n,int k){
        if(root==null)
         return -1;
        if(root.data==n)
         return 0;
        int leftDist=kAncestor(root.left,n,k);
        int rightDist=kAncestor(root.left,n,k);
        if(leftDist==-1 && rightDist==-1)
         return -1;
        int max=Math.max(leftDist,rightDist);
        if(max+1==k)
         System.out.println(root.data);
        return max+1;
      }
       
       
    public static void main(String[] args) {
        //      1
        //     / \
        //     2  3
        //    /\  /\
        //    4 5 6 7
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sum(root  ));
        // System.out.println(diameter(root)); //O(n2) time complexity
        // int k=13;
        // klevel(root, 1, k);
        int n=4;int l=2;
      kAncestor(root,n,l);
    }
    
}
