package Graph.pw;
import java.util.*;

public class dfs_trav {
    //Function to return a List containning the DFS traversal of the graph.
  
    public static  void dfs(int s,boolean[] vis,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        //make vertex as visited
         vis[s]=true;
         //add vertex to ans list
         ans.add(s);
         //dfs on connection of s
         for(int i:adj.get(s)){
            if(vis[i]==false)
             dfs(i,vis,adj,ans);
         }

     
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList();
       // ArrayList<ArrayList<Integer>> adj[][]={{1,2},{0,3},{0,3},{1,2}};  //list representation of graph
        int v=3;
        boolean vis[]=new boolean[v];
      //  dfs(0,vis,adj, ans);
        //this question on gfg
        
    }
    
}
