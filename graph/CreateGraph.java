package graph;

import java.util.ArrayList;

public class CreateGraph {
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
        graph[1].add(new Edge(1,4));
        graph[2].add(new Edge(2,5));
        graph[2].add(new Edge(2,6));  
        graph[3].add(new Edge(3,7));
        graph[4].add(new Edge(4,8));
        graph[5].add(new Edge(5,9));
        graph[6].add(new Edge(6,10));
    }
    static void printGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            System.out.print(i+" -> ");
            for(Edge e: graph[i]){
                System.out.print("("+e.src+" "+e.dest+") ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
        printGraph(graph);
        
    }
}