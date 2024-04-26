package Backtracing;

public class shuffle {
    public static void shuffle(int arr[], int n){
        int i=0;
        int j=n/2;
        int ans[]=new int[n];
        int k=0;
        while(i<n/2 &&j<n){
            ans[k]=arr[i];
            ans[++k]=arr[j];
            i++;j++;k++;
        }
        for(int m=0;m<n;m++)
         System.out.print(ans[m]+" ");

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        shuffle(arr,8);
    }
    
}
