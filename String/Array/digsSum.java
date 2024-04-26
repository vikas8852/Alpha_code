package String.Array;

public class digsSum {

    public static int sum(int array[][]){
        int sumEle=0;
        for(int i=0;i<array.length;i++){
            
            //SD
            if(i!=array.length-i-1)
             sumEle+=array[i][array.length-i-1];
            //PD
             sumEle+=array[i][i];
        }
        return sumEle;

    }
    public static void main(String[] args) {

        int arr[][]={{7,6,3},{3,8,3},{4,9,2}};
        int res=sum(arr);
        System.out.println(res);
    }
}
