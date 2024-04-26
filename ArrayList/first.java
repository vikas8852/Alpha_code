package ArrayList;
import java.util.*;

public class first {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
         ArrayList<Integer> list1=new ArrayList<>();
          ArrayList<Integer> list2=new ArrayList<>();

          list.add(1); //FOR ADDING THE ELEMENT
          list.add(2);
          list.add(3);
          System.out.println(list);
          int a=list.get(2); //FOR ACCESING  THE ELE AT ANY INDEX
          System.out.println(a);
          list.remove(2);   //FOR REMOVING THE ELEMENT
          System.out.println(list);
          list.set(1,10);//FOR Update THE ELEMENT AT ANY INDEX
          System.out.println(list.contains(10));
          //PRINT THE ARRAYLIST
          for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
          }
    }
    
}
