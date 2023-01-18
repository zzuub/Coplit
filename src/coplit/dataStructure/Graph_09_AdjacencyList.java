package coplit.dataStructure;

import java.util.ArrayList;

public class Graph_09_AdjacencyList {
    private ArrayList<ArrayList<Integer>> graph;

    public Graph_09_AdjacencyList() {
        graph = new ArrayList<>();
    }

    public void setGraph(int size){
        for(int i = 0; i < size; i++) {
            graph.add(new ArrayList<Integer>());
        }
    }

    public ArrayList<ArrayList<Integer>> getGraph() {
        return graph;
    }

    // TODO: 간선을 추가합니다.
    public void addEdge(int from, Integer to) {
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) {
            return;
        }

        graph.get(from).add(to);
        graph.get(to).add(from);
    }

    public boolean hasEdge(int from, int to) {
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()) {
            return false;
        }
        else return graph.get(from).contains(to);
    }

    public void removeEdge(int from, int to) {
        if(from < 0 || to < 0 || from >= graph.size() || to >= graph.size()){
            return;
        }

        if(graph.get(from).contains(to)) {
            graph.get(from).remove((Integer) to);
        }

        if(graph.get(to).contains(from)) {
            graph.get(to).remove((Integer) from);
        }
    }
}
