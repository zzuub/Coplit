package coplit.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DFS_06_NewRecipe {
    public ArrayList<Integer[]> newRecipe(int[] stuffArr, int choiceNum) {

        ArrayList<Integer> freshArr = new ArrayList<>();

        for(int i = 0; i < stuffArr.length; i++) {
            String str = String.valueOf(stuffArr[i]);

            int[] ingredient = str.chars().filter(c -> c == '0').toArray();

            if(ingredient.length <= 2){
                freshArr.add(stuffArr[i]);
            }
        }

        Collections.sort(freshArr);

        if(freshArr.size() == 0 || freshArr.size() < choiceNum){
            return null;
        }

        ArrayList<Integer[]> result = new ArrayList<>();

        boolean[] visited = new boolean[freshArr.size()];
        return output(choiceNum, new Integer[]{}, result, freshArr, visited, 0);
    }

    public ArrayList<Integer[]> output(int choiceNum, Integer[] bucket, ArrayList<Integer[]> result, ArrayList<Integer> freshArr, boolean[] visited, int depth){
        if(depth == choiceNum){
            result.add(bucket);
            return result;
        }

        for(int i = 0; i < freshArr.size(); i++){
            if(!visited[i]){
                visited[i] = true;

                Integer[] concatArray = Arrays.copyOf(bucket, bucket.length + 1);
                concatArray[concatArray.length - 1] = freshArr.get(i);

                result = output(choiceNum, concatArray, result, freshArr, visited, depth + 1);

                visited[i] = false;
            }
        }
        return result;
    }
}
