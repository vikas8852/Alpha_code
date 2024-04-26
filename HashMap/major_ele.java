package HashMap;
import java.util.*;
public class major_ele {
    public static void main(String[] args) {
        int arr[]={1,3,2,5,1,3,3,5,1,3,1}; //THIS QUES FIND THE FREQ OF EACH ELEMENT AND CHECK IF IT GREATER THAN 
        //GIVEN CONDITION
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
          //  map.put(arr[i],map.getOrDefault(arr[i],0)+1);  //only this line can be used in place of above three line
        }
        Set<Integer>keySet=map.keySet();
        for(Integer key:keySet){
            if(map.get(key)>arr.length/3){
                System.out.print(key+" ");
            }

        }
    }
    
}
