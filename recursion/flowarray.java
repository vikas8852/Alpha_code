package recursion;

public class flowarray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{5,6,7},{9,10,11}};
        int r=3;
        int j=0;
        for(int i=0;i<r;i++){
         if(j==0){
          while(j<r){
            System.out.print(arr[j][i]);
            j++;
          }
           
         }
         else{
            while(j>0)
          
             System.out.print(arr[j-1][i]);
             j--;
         }
         System.out.print(" ");
        }
    }
    
}
