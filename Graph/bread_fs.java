package Graph;
import java.util.*;
public class bread_fs {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }

    }
    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0); //source
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){ //visit curr
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }

        }
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        //visit
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }

    }
    public static void main(String[] args) {
        /*          
                  1----3
                /      | \
         *     0       |  5---6
         *      \      | /
         *       2---- 4
        
         */


        int v=7;
        ArrayList<Edge>[]graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();
        }
        //0 vertices
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        //1 vertices
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));
         
        //2 vertices
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        //3 vertices
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        //4 vertices
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));
        //5 vertices
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6,1));
     
        
        

        bfs(graph);
        System.out.println();
        dfs(graph,0,new boolean[v]);
        
    }
    
}
