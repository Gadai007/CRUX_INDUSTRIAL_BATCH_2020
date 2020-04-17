package Lecture22_Graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MinimumSpanningTree<T> {

    Map<T,Vertex> vertexMap;

    Map<Vertex, Vertex> parent;

    public MinimumSpanningTree() {
        this.vertexMap = new HashMap<>();
        this.parent = new HashMap<>();
    }

    class Vertex{

        T value;
        Map<Vertex,Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new HashMap<>();
        }
    }

    private class Edge {
        Vertex first;
        Vertex second;
        Integer weight;

        public Edge(Vertex first, Vertex second, Integer weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }
    }

    public void setParent(){

        for (Vertex vertex:vertexMap.values()) {

            parent.put(vertex,null);
        }
    }

    public Vertex find(Vertex vertex){   //it is used to check the parent

        while (parent.get(vertex)!=null){
            vertex = parent.get(vertex);
        }
        return vertex;
    }

    public boolean union(Vertex first, Vertex second){

        Vertex f = find(first);
        Vertex s = find(second);

        if(f!=s){
            parent.put(f,s);
            return true;
        }
        return false;
    }


    public MinimumSpanningTree<T> kruskal(){

        setParent();

        ArrayList<Edge> edges = new ArrayList<Edge>();

        MinimumSpanningTree<T>  map = new MinimumSpanningTree<>();

        for (T values: vertexMap.keySet()) {
            map.addVertex(values);
        }

        for (Vertex vertex:vertexMap.values()) {

            for (Vertex padosi: vertex.neighbours.keySet()) {

                edges.add(new Edge(vertex,padosi,vertex.neighbours.get(padosi)));
            }
        }

        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return o1.weight-o2.weight;
            }
        });

        for (Edge edge: edges) {

            if (union(edge.first,edge.second)){
                map.addEdgeWeight(edge.first.value,edge.second.value,edge.weight);
            }
        }
        return map;
    }

    public void addVertex(T value){
        vertexMap.put(value,new Vertex(value));
    }

    public void addEdge(T first, T second){
        vertexMap.get(first).neighbours.put(vertexMap.get(second),1);   //undirected graph
        vertexMap.get(second).neighbours.put(vertexMap.get(first),1);
    }

    public void addEdgeWeight(T first, T second, Integer weight){
        vertexMap.get(first).neighbours.put(vertexMap.get(second),weight);
        vertexMap.get(second).neighbours.put(vertexMap.get(first),weight);
    }

    public void display(){
        for (Vertex vertex: vertexMap.values()) {
            System.out.print(vertex.value + "->");

            for (Vertex padosi:vertex.neighbours.keySet()) {
                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
    }
}
