package coplit.dataStructure;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_BFS_12_ConnectedVertices {
    public int connectedVertices(int[][] edges) {
        final int[] bigger = {0};

        Arrays.stream(edges).forEach(data -> {
            int currentBigger = Arrays.stream(data)
                    .boxed()
                    .max(Comparator.comparing(i -> i))
                    .orElse(0);
            if(bigger[0] < currentBigger) bigger[0] = currentBigger;
        });

        int[][] adjArray = new int[bigger[0] + 1][bigger[0] + 1];

        for(int i = 0; i < edges.length; i++) {
            int from = edges[i][0];
            int to = edges[i][1];
            adjArray[from][to] = 1;
            adjArray[to][from] = 1;
        }

        boolean[] visited = new boolean[bigger[0] + 1];
        int count = 0;

        for(int vertex = 0; vertex < visited.length; vertex++) {

            if(!visited[vertex]) {
                count++;
                visited = bfs_array(adjArray, vertex, visited);

            }
        }
        return count;
    }

    public boolean[] bfs_array(int[][] adjArray, int vertex ,boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(vertex);
        visited[vertex] = true;

        while (!queue.isEmpty()) {
            int cur = queue.poll();

            for (int i = 0; i < adjArray[cur].length; i++) {

                if(adjArray[cur][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
        return visited;
    }
    public boolean[] dfs_array(int[][] adjArray, int vertex ,boolean[] visited) {
        visited[vertex] = true;

        for (int i = 0; i < adjArray.length; i++) {

            if (adjArray[vertex][i] == 1 && !visited[i]) {
                dfs_array(adjArray, i, visited);
            }
        }

        return visited;
    }
}
