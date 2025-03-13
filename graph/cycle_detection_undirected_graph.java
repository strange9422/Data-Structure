package graph;
import java.util.*;
public class cycle_detection_undirected_graph {
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
        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));  
    
        
    }
    static boolean cycle_detection_undirected(ArrayList<Edge> graph[],int curr,boolean visited[] , int parent){
        visited[curr]=true;
        for(Edge e:graph[curr]){
            if(!visited[e.dest]){
                if(cycle_detection_undirected(graph, e.dest, visited, curr)){
                    return true;
                }
            }
            else if(e.dest!=parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v=3;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
        boolean visited[] = new boolean[v];
       
        for(int i=0;i<v;i++){
            if(visited[i]==false){
                if(cycle_detection_undirected(graph, i, visited, -1)){
                    System.out.println("Cycle is present");
                    break;
                }
            }
        }
       
    }
}
