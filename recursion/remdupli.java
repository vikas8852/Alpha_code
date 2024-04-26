package recursion;

public class remdupli {
    public static void remove(int arr[]){
        int a[]=new int[arr.length];
        int visit=-1;
        for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j])
                a[j]=visit;
            
         }
         if(a[i]!=visit)
          a[i]=arr[i];

        }
        for(int i=0;i<arr.length;i++){
            if(a[i]!=visit)
             System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
      int arr[]={2,2,3,4,2,5,8}  ;
      remove(arr);
     
    }
    
}
