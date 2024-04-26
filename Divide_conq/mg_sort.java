package Divide_conq;

public class mg_sort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid); //right part
        mergeSort(arr, mid+1, ei); //left part
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
     int temp[]=new int[ei-si+1];
     int i=si; //iterator for left part
     int j=mid+1; //iterator for right part
     int k=0; //iterator for temp array
     
     while(i<=mid && j<=ei){
        if(arr[i]<arr[j]){
            temp[k]=arr[i];
            i++;
        }
        else{
            temp[k]=arr[j];
            j++;
        }
        k++;
         
     }
     //left part
     while(i<=mid){
        temp[k++]=arr[i++];
     }
     //Righr part
      while(j<=ei){
        temp[k++]=arr[j++];
     }

   //COPY TEMP TO ORIGINAL ARRAY
   for(k=0,i=si;k<temp.length;k++,i++){
    arr[i]=temp[k];
   }

    }
    public static void main(String[] args) {
        int arr[]={1,3,9,5,2,8,-7};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }
    
}
