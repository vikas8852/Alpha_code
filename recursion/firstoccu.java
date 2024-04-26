package recursion;

public class firstoccu {
    public int check(int [] a,int key,int i){
        if(i==a.length-1)
         return -1;
        if(a[i]==key)
         return i;
        return check(a,key,i+1);
    }
    public int lastCheck(int a[],int key,int i){
        if(i==0)
         return -1;
        if(a[i]==key)
         return i;
       return lastCheck(a,key,i-1);
    }
    public static void main(String[] args) {
        firstoccu aa=new firstoccu();
        int arr[]={4,5,2,8,6,5,7,9};
        System.out.println(aa.check(arr,5,0));
       System.out.println(aa.lastCheck(arr,5,arr.length-1));

       
        
    }
    
}
