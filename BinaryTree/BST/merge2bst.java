package BinaryTree.BST;

import java.util.ArrayList;

public class merge2bst {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.right=this.left=null;
        }
    }
    public static void getInorder(Node root,ArrayList<Integer> arr){
        if(root==null)
         return;
         getInorder(root.left,arr);
         arr.add(root.data);
         getInorder(root.right,arr);
    }
    public static Node createBST(ArrayList<Integer>arr,int st,int end){
        if(st>end)
         return null; 
        int mid=(st+end)/2;
        Node root=new Node(arr.get(mid));
        root.left=createBST(arr,st,mid-1);
        root.right=createBST(arr,mid+1,end);
        return root;


    }
    public static Node mergeBST(Node root1,Node root2){
        //step 1
        ArrayList<Integer> ar1=new ArrayList<>();
        getInorder(root1, ar1);
         //step 2
         ArrayList<Integer> ar2=new ArrayList<>();
         getInorder(root2, ar1);

         //merge
         int i=0,j=0;
         ArrayList<Integer> finalarr=new ArrayList<>();
         while(i<ar1.size() && j<ar2.size()){
            if(ar1.get(i)<=ar2.get(j)){
                finalarr.add(ar1.get(i));
                i++;

            }else{
                finalarr.add(ar1.get(j));
                j++;

            }
         }
         while(i<ar1.size()){

            finalarr.add(ar1.get(i));
                i++;
         }
         while(i<ar2.size()){

            finalarr.add(ar2.get(j));
                j++;
         }
          return createBST(finalarr,0,finalarr.size()-1);


    }
    public static void preorder(Node root){
        if(root==null)
         return;
         System.out.println(root.data+" ");
         preorder(root.left);
         preorder(root.right);
    }
    public static void main(String[] args) {
        /*   2
            / \
            1  4

            */
            Node root1=new Node(2);
            root1.left=new Node(1);
            root1.right=new Node(4);

        /*   9
            / \
            1  12

            */
            Node root2=new Node(9);
            root2.left=new Node(1);
            root2.right=new Node(12);
            Node root=mergeBST(root1,root2);
    }
    
}
