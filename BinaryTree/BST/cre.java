package BinaryTree.BST;

public class cre {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;

        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
          root=new Node(val);
          return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }else{
            //right subtree
            root.right=insert(root.right,val);
        }
        return root;

    }
    public static void inOrder(Node root){
        if(root==null)
        return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static boolean search(Node root,int key){
        if(root==null) 
         return false;
        if(root.data==key)
         return true;
        if(root.data>key)
         return search(root.left,key);
        else
         return search(root.right,key);

    }
    public static Node delete(Node root, int val){
        if(root.data<val)
         root.right=delete(root.left, val);
        else if(root.data>val)
         root.left=delete(root.left, val);
        else{
            // case1-leaf Node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2- single child
            if(root.left==null){
                return root.right;
              }
            else if(root.right==null){
                return root.left; 
            }
            //case 3 -both children
            Node IS=findIS(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
     public static Node findIS(Node root){
        while(root.left!=null){
         root=root.left;
        }
        return root;
     }
     public static void printInRange(Node root, int k1,int k2){
        if(root==null)
         return;
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data<k1)
         printInRange(root.left, k1, k2);
        else
         printInRange(root.right, k1, k2);
     }
     public static boolean isValidBST(Node root,Node min, Node max){
        if(root==null)
         return true;
        if(min!=null && root.data<=min.data)
         return false;
       else if(min !=null && root.data>=max.data)
         return false;
        return isValidBST(root.left,min,root)&& isValidBST(root.right, root, max);
     }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7,6,8};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
       
        inOrder(root);
        System.out.println();
        //  System.out.println();
        // if(search(root, 2))
        //  System.out.println("found");
        // else
        //  System.out.println("not found");
        // root=delete(root, 5);
        // System.out.println();
        // inOrder(root);
        printInRange(root, 4, 7);
        // if(isValidBST(root, null, null)){
        //     System.out.println("valid");
        // }
        // else
        // System.out.println("not valid");

    }


    
}
