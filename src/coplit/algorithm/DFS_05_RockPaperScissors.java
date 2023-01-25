package coplit.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

public class DFS_05_RockPaperScissors {
    public ArrayList<String[]> rockPaperScissors(int rounds) {
        ArrayList<String[]> result = new ArrayList<>();
        return permutation(rounds, new String[]{}, result);
    }

    public ArrayList<String[]> permutation(int roundsToGo, String[] playedSoFar, ArrayList<String[]> result) {
        if(roundsToGo == 0) {
            result.add(playedSoFar);
            return result;
        }
        String[] rps = new String[]{"rock", "paper", "scissors"};

        for(int i = 0; i < rps.length; i++) {

            String currentPlay = rps[i];
            String[] concatArray = Arrays.copyOf(playedSoFar, playedSoFar.length + 1);
            concatArray[concatArray.length - 1] = currentPlay;

            result = permutation(roundsToGo - 1, concatArray, result);
        }

        return result;
    }
}
