package graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
// time complexity o(E + ElogV)
public class Dijktras_algorith {
     static class Edge{
        int src, dest,weight;
        public Edge(int src, int dest,int weight){
            this.src = src;
            this.dest = dest;
            this.weight=weight;
        }
    }
    static void CreatingGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,3));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,2));
        graph[1].add(new Edge(1,4,3));
        graph[2].add(new Edge(2,5,4));
        graph[2].add(new Edge(2,6,5));  
        graph[3].add(new Edge(3,7,2));
        graph[4].add(new Edge(4,8,4));
        graph[5].add(new Edge(5,9,1));
        graph[6].add(new Edge(6,10,2));
    }
    static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int node, int dist){
            this.node=node;
            this.dist=dist;
        }
       @Override
       public int compareTo(Pair p2){
            return dist - p2.dist; //ascending
            // return p2.dist - dist descending
       }
    }

    public static void dijktras_algo(ArrayList<Edge> graph[],int src,int ver){
        PriorityQueue<Pair>pq = new PriorityQueue<>();
        int dist[] = new int[ver];
        for(int i = 0;i<ver;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
            else{
                dist[i]=0;
            }
        }
        boolean [] vist= new boolean[ver];
        pq.add(new Pair(src,0 ));
        //bfs
        while(!pq.isEmpty()){
            Pair curr= pq.remove();
            if(!vist[curr.node]){
                vist[curr.node]=true;
                for(int i = 0; i < graph[curr.node].size(); i++) {
                    Edge edge = graph[curr.node].get(i);
                    int u=edge.src;
                    int v=edge.dest;
                    if(dist[u]+edge.weight<dist[v]){
                        dist[v]=dist[u]+edge.weight;
                    }
                    pq.add(new Pair(v, dist[v]));
                }
            }
        }

        for(int i:dist){
            System.out.print(i + " " );
        }

    }
    public static void main(String[] args) {
        int v=11;
        ArrayList<Edge>[] graph = new ArrayList[v];
        CreatingGraph(graph);
        dijktras_algo(graph, 0, v);
       
        
    }
}
