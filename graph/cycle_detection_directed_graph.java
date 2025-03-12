package graph;

import java.util.ArrayList;

public class cycle_detection_directed_graph {
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
        graph[2].add(new Edge(2,4));
        graph[2].add(new Edge(2,0));  
        graph[3].add(new Edge(3,4));
        graph[4].add(new Edge(4,3));
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
        
    }
    static boolean cycle_detection(ArrayList<Edge> graph[], int curr, boolean visited[],boolean recursiostack[]){
        visited[curr] = true;

        recursiostack[curr] = true;
        for(Edge e:graph[curr]){
            if(recursiostack[e.dest]){
                return true;
            }else if(!visited[e.dest]){
                if(cycle_detection(graph, e.dest, visited, recursiostack)){
                    return true;
                }
            }
        }
        recursiostack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
        boolean visited[] = new boolean[v];
        boolean recursiostack[] = new boolean[v];
        
        for(int i=0;i<v;i++){
            if(cycle_detection(graph, i, visited, recursiostack)){
                System.out.println("Cycle is present");
                return;
            }
        }
        
    }
}
