package Graph.pw;

public class cyc_det_dir {
    /*
    class Solution {
    // Function to detect cycle in a directed graph.
       public static boolean dfs(int s,boolean vis[],boolean dfsv[], ArrayList<ArrayList<Integer>> adj){
            vis[s]=true;
            dfsv[s]=true;
            for(int i:adj.get(s)){// call dfs on unvisited connection of s
                if(vis[i]==false){
                    if(dfs(i,vis,dfsv,adj))
                     return true;
                }
                else if(dfsv[i]==true)
                 return true;
            }
            dfsv[s]=false;
            return false;
        }
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean vis[]=new boolean[V];
        boolean dfsv[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(vis[i]==false)
              if(dfs(i,vis,dfsv,adj))
               return true;
        }   
        return false;
    }
} 

     */
    
}
