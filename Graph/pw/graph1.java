package Graph.pw;
import java.util.*;
public class graph1 {
    public static void addEdge(ArrayList<ArrayList<Integer>> Al,int u,int v){
        Al.get(u).add(v);
        Al.get(v).add(u);

    }
    public static void main(String[] args) {
        int  V=4;
        //create adjacency List
        ArrayList<ArrayList<Integer>> Al=new ArrayList<>(V);

        for(int i=0;i<V;i++){
            Al.add(new ArrayList<Integer>());
        }
        // Add edges
        addEdge(Al, 0, 1);
        addEdge(Al, 0, 2);
        addEdge(Al, 1, 2);
        addEdge(Al, 2, 3);

        System.out.println(Al);
    }
    
}
