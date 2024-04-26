package Graph.pw;
import java.util.*;
public class prims_algo {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
         //prims algo
          boolean[] vis = new boolean[V];
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
         int cost = 0;
         pq.add(new int[]{0,0});
         while(!pq.isEmpty()){
           int[] x = pq.remove();
           if(vis[x[0]]==true)
             continue;
           vis[x[0]] = true;
            cost += x[1];
         //add connections of x[0] to pq
         for( ArrayList<Integer> i : adj.get(x[0])){
           int v = i.get(0); //vertex  connection / neighbor
           int w = i.get(1); //weight
            pq.add(new int[]{v,w});
         }
 }
         return cost;
         }
    public static void main(String[] args) {
        int v=4; //number of vertices
        ArrayList<ArrayList<ArrayList<Integer>>> adj=new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        //define the adj list with edge and weight

        // edge from vertex 0 to veertex 1 with weight 2
        adj.get(0).add(new ArrayList<>());
        adj.get(0).get(0).add(1);
        adj.get(0).get(0).add(2);

       // Edge from vertex 0 to vertex 2 with weight 3

       adj.get(0).add(new ArrayList<>());
       adj.get(0).get(1).add(2);
       adj.get(0).get(1).add(3);

       // Edge from vertex 1 to vertex 2 with weight 1

       adj.get(1).add(new ArrayList<>());
       adj.get(1).get(0).add(2);
       adj.get(1).get(0).add(1);
       // Edge from vertex 1 to vertex 3 with weight 4

        adj.get(1).add(new ArrayList<>());
        adj.get(1).get(1).add(3);
         adj.get(1).get(1).add(4);
        // Edge from vertex 2 to vertex 3 with weight 5

         adj.get(2).add(new ArrayList<>());
         adj.get(2).get(0).add(3);
         adj.get(2).get(0).add(5);
         int cost = spanningTree(v, adj);
         System.out.println("Sum of weights in  Minimum Spanning Tree: "+cost);

    }
    
}
