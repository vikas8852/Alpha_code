package String.Array;

public class stairCasesearch {
    public static boolean search(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key==arr[row][col]){
               System.out.println("element is found at "+row+","+col);
               return true;
            }
            else if(key<arr[row][col])
              col--;
            else
            row++; 
        }
        System.out.println("Elemennt not present");
        return false;
    }
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {29,32,42,55}};

        search(mat, 37);

    }
 
    
}
