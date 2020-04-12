package Lecture22_Graph;

public class AdjacentMapGraphClient {
    public static void main(String[] args) {

        AdjacentMapGraph<String> graph = new AdjacentMapGraph<>();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdge("A","B");
        graph.addEdge("A","C");

        graph.display();
    }
}
