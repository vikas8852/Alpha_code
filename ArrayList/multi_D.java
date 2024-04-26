package ArrayList;
import java.util.*;
public class multi_D {
    public static void main(String[] args) {
        ArrayList< ArrayList<Integer>> main=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);list1.add(3);
        main.add(list1);
          ArrayList<Integer> list2=new ArrayList<>();
          list2.add(2); list2.add(4);list2.add(5);  
          main.add(list2);
          System.out.println(main);
          for(int i=0;i<main.size();i++){
            ArrayList<Integer> curr=main.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
          }


    }
    
}
