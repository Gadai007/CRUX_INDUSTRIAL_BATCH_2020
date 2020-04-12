package Lecture22_Graph;

import java.util.HashMap;
import java.util.Map;

public class AdjacentMapGraph<T> {

    Map<T, Vertex> vertexMap;

    public AdjacentMapGraph() {
        this.vertexMap = new HashMap<>();
    }

    class Vertex{

        T value;
        Map<Vertex,Integer> neighbours;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new HashMap<>();
        }
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
