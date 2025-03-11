package graph;
import java.util.*;

// This is the BFS traversal of a graph
// The graph is created using the CreateGraph.java file
// The graph is created using the adjacency list representation
// The graph is traversed using the BFS traversal
// The BFS traversal is done using the queue data structure
// The visited array is used to keep track of the visited nodes
// The queue is used to keep track of the nodes that are to be visited
// The BFS traversal is done in the order of the nodes that are visited
//time complexity is O(V+E)
//space complexity is O(V)
public class BFS_graph {
    static class Edge{
        int src, dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static void CreatingGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,5));
        graph[2].add(new Edge(2,6));  
        graph[3].add(new Edge(3,7));
        graph[4].add(new Edge(4,8));
        graph[5].add(new Edge(5,9));
        graph[6].add(new Edge(6,10));
        graph[7].add(new Edge(12,11));
    }
    public static void printGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            System.out.print(i+" -> ");
            for(Edge e: graph[i]){
                System.out.print("("+e.src+" "+e.dest+") ");
            }
            System.out.println();
        }
    }
    
    public static void bfs(ArrayList<Edge> graph[],Queue<Integer> q,boolean visited[],int start){
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(visited[curr]!=true){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(Edge e:graph[curr]){
                    if(visited[e.dest]!=true){
                        q.add(e.dest);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=13;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
  
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[v];
        for(int i=0;i<v;i++){
            if(visited[i]!=true){
                bfs(graph,q,visited,i);
            }
        }

    }
    
}
