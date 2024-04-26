package recursion;

public class rec1 {
    public static int indic(int arr[],int key, int n){
        if(n==arr.length)
         return 0;
        if(arr[n]==key)
         System.out.print(n+" ");

         return indic(arr,key ,n+1) ;

             }
    public static void main(String[] args) {
     
        int arr[]={0,1,2,4,2,8,3,2,2,9};
        int  key=2;
        indic(arr, key, 0);
    }
    
}
