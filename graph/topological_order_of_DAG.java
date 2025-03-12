package graph;

import java.util.ArrayList;
import java.util.Stack;
//It only applies to Directed Acyclic Graph(DAG)
//time complexity is O(V+E) where V is the number of vertices and E is the number of edges
public class topological_order_of_DAG {
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
        
        graph[5].add(new Edge(5,6));
        graph[6].add(new Edge(6,5));
        
    }
    static  void topological_order(ArrayList<Edge> graph[],int curr,boolean visited[],Stack<Integer> stack){
        visited[curr] = true;
        for(Edge e:graph[curr]){
            if(!visited[e.dest]){
                topological_order(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
        boolean visited[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<v;i++){
            if(visited[i]==false){  
                topological_order(graph, i, visited, stack);
                
            }
        }
        for(int j=stack.size()-1;j>=0;j--){
            System.out.print(stack.pop() + " ");
        }
        
    }
}
