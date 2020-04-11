package Lecture21_Graphs;

public class ListGraphClient {
    public static void main(String[] args) {

        AdjacentListGraph<String> graph = new AdjacentListGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("C","D");

        //graph.BST();

        graph.display();
    }
}
