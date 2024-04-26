package divide_conqure;

public class merge {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,ei);//right part
        merges(arr,si,mid,ei);
    }
    public static void merges(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si;  //iterator for left part
        int j=mid+1; //iterator for left part
        int k=0;//iterator for temp arr
        while(i<= mid && j<= ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            } else{
                temp[k]=arr[j];
                 j++;
            }
            k++;
        }
        //left part
        while(i<= mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<= ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }
    
}
