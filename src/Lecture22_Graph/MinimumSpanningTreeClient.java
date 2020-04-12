package Lecture22_Graph;

public class MinimumSpanningTreeClient {
    public static void main(String[] args) {
        MinimumSpanningTree<String> graph = new MinimumSpanningTree<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");

        graph.addEdgeWeight("A","B",4);
        graph.addEdgeWeight("A","C",2);
        graph.addEdgeWeight("B","C",1);

        MinimumSpanningTree<String> graph1 = graph.kruskal();

        graph1.display();
    }
}
