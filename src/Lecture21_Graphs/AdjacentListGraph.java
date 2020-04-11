package Lecture21_Graphs;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class AdjacentListGraph<T> {

    LinkedList<Vertex> vertices;

    public AdjacentListGraph() {
        this.vertices = new LinkedList<>();
    }

    class Vertex{
        T value;
        LinkedList<Vertex> neighbour;

        public Vertex(T value) {
            this.value = value;
            this.neighbour = new LinkedList<>();
        }
    }

    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T first, T second){

        Vertex f = get(first);
        Vertex s = get(second);

        if(f != null && s!= null){
            f.neighbour.add(s);
            s.neighbour.add(f);
        }
    }

    public Vertex get(T value){

        for (Vertex vertex:vertices) {
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    public void display(){

        for (Vertex vertex:vertices) {
            System.out.print(vertex.value + "->");

            for (Vertex padosi:vertex.neighbour) {
                System.out.print(padosi.value + " ");
            }
            System.out.println();
        }
    }

    public void BST(){
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex first = vertices.get(0);

        queue.add(first);
        visited.add(first);

        while (!queue.isEmpty()){

            Vertex temp = queue.remove();
            System.out.println(temp.value);

            for (Vertex padosi:temp.neighbour) {
                if (!visited.contains(padosi)){
                    visited.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }
}
