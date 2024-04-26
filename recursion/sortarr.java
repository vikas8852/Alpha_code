package recursion;

public class sortarr {
    public boolean sort(int a[],int i){
        if(i==a.length-1)
         return true;
        if(a[i]>a[i+1])
         return false;
        return sort(a,i+1);

    }
    public static void main(String[] args) {
        sortarr ss=new sortarr();
        int arr[]={1,4,3,9,12};
        if(ss.sort(arr,0))
         System.out.println("Array is Sorted");
        else
         System.out.println("Arrat is not sorted");

    }
    
}
