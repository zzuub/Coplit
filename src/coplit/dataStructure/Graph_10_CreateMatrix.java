package coplit.dataStructure;

public class Graph_10_CreateMatrix {
    public int[][] createMatrix(int[][] edges) {

        int[][] graph;
        int edgesLength = 0;

        for(int i= 0; i<edges.length; i++){
            for(int j = 0; j <edges[i].length; j++){
                if(edgesLength < edges[i][j]) edgesLength = edges[i][j];
            }
        }

        graph = new int[edgesLength + 1][edgesLength + 1];

        for(int i =0; i <edges.length; i++){
            int from = edges[i][0];
            int to = edges[i][1];
            int direction = edges[i][2];

            if(direction == 0){
                graph[from][to] = 1;
            }

            else if(direction == 1){
                graph[from][to] = 1;
                graph[to][from] = 1;
            }
        }
        return graph;
    }
}
