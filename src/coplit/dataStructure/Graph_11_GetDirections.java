package coplit.dataStructure;

import java.util.Arrays;

public class Graph_11_GetDirections {
    public boolean getDirections(int[][] matrix, int from, int to) {
        int[][] currentMatrix = new int[matrix.length][];

        for(int i = 0; i <matrix.length; i++){
            currentMatrix[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        }

        if(from == to){
            return true;
        }

        for(int i = 0; i < currentMatrix[from].length; i++){
            if(currentMatrix[from][i] == 1){
                currentMatrix[from][i] = 0;

                if(getDirections(currentMatrix, i, to)){
                    return true;
                }
            }

        }
        return false;
    }
}
