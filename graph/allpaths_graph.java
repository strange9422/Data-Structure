package graph;

import java.util.ArrayList;

public class allpaths_graph {
    
    static class Edge{
        int src, dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    static void CreatingGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,3));
        graph[3].add(new Edge(3,4));
        graph[2].add(new Edge(2,4));
          
        graph[3].add(new Edge(3,5));
        graph[4].add(new Edge(4,5));
        graph[5].add(new Edge(5,6));
       
    }
    static void allthpaths(ArrayList<Edge> graph[], int src, int dest, boolean visited[], String path){
        if(src==dest){
            System.out.println(path);
            return;
        }
        visited[src] = true;
        for(Edge e: graph[src]){
            if(!visited[e.dest]){
                allthpaths(graph, e.dest, dest, visited, path+e.dest);
            }
        }
        visited[src] = false;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
        boolean visited[] = new boolean[v];
        int src = 0;    // source
        int dest = 5; // destination
        String path = src+"";   // path 

        allthpaths(graph, src,dest, visited ,path);
       
        
    }
}
