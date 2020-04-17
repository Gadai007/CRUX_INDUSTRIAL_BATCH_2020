package Lecture21_Graphs;

import java.util.*;

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

    public Vertex get(T value){

        for (Vertex vertex:vertices) {
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    public void addEdge(T first, T second){

        Vertex f = get(first);
        Vertex s = get(second);

        if(f != null && s!= null){
            f.neighbour.add(s);
            s.neighbour.add(f);
        }
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
            System.out.print(temp.value);

            for (Vertex padosi:temp.neighbour) {
                if (!visited.contains(padosi)){
                    visited.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    public boolean BFS(T value){
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex first = vertices.get(0);

        queue.add(first);
        visited.add(first);

        while (!queue.isEmpty()){
            Vertex temp = queue.remove();
            if (temp.value.equals(value)){
                return true;
            }

            for (Vertex padosi:vertices) {
                if(!visited.contains(padosi)){
                    queue.add(padosi);
                    visited.add(padosi);
                }
            }
        }
        return false;
    }

    public void DFT(){
        Stack<Vertex> stack = new Stack<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex first = vertices.get(0);

        stack.push(first);
        visited.add(first);

        while(!stack.isEmpty()){
            Vertex temp = stack.pop();
            System.out.print(temp.value);

            for (Vertex padosi:vertices) {
                if(!visited.contains(padosi)){
                    stack.push(padosi);
                    visited.add(padosi);
                }
            }
        }
    }

    public void connectedcomponents(){
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        for (Vertex vertex:vertices) {
            if(!visited.contains(vertex)){
                continue;
            }
            queue.add(vertex);
            visited.add(vertex);

            while (!queue.isEmpty()){

                Vertex temp = queue.remove();
                System.out.print(temp.value);

                for (Vertex padosi:temp.neighbour) {
                    if (!visited.contains(padosi)){
                        visited.add(padosi);
                        queue.add(padosi);
                    }
                }
            }
        }
    }

    public boolean bipartite(){    //graph colour red and green
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> visited = new HashSet<>();

        Vertex first = vertices.get(0);

        Set<Vertex> red = new HashSet<>();
        Set<Vertex> green = new HashSet<>();

        queue.add(first);
        visited.add(first);
        red.add(first);

        while (!queue.isEmpty()){

            Vertex temp = queue.remove();

            if(red.contains(temp)){

                for (Vertex padosi:temp.neighbour) {

                    if(!visited.contains(padosi)){
                      queue.add(padosi);
                      green.add(padosi);
                      visited.add(padosi);
                    }
                    else if(red.contains(padosi)){
                        return false;
                    }
                }
            }

            if(green.contains(temp)){
                for (Vertex padosi:temp.neighbour) {

                    if(!visited.contains(padosi)){
                        queue.add(padosi);
                        red.add(padosi);
                        visited.add(padosi);
                    }
                    else if(green.contains(padosi)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
