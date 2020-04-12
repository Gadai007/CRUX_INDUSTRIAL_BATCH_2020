package Lecture21_Graphs;

public class ListGraphClient {
    public static void main(String[] args) {

        AdjacentListGraph<String> graph = new AdjacentListGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("C","D");
        graph.addEdge("A","C");
        graph.addEdge("A","B");
        graph.addEdge("D","B");
        graph.addEdge("A","D");

        //graph.BST();
        //graph.DFT();
       // System.out.println(graph.BFS("E"));
        //graph.connectedcomponents();
        System.out.println(graph.bipartite());

       // graph.display();
    }
}
