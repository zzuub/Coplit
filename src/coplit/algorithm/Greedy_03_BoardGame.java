package coplit.algorithm;

import java.util.HashMap;


public class Greedy_03_BoardGame {
    public Integer boardGame(int[][] board, String operation) {
        HashMap<String, int[]> DIR = new HashMap<String, int[]>(){{
            put("U", new int[]{-1, 0});
            put("D", new int[]{1, 0});
            put("L", new int[]{0, -1});
            put("R", new int[]{0, 1});
        }};

        int LEN = board.length;
        int Y = 0;
        int X = 0;
        int score = 0;

        char[] chars = operation.toCharArray();

        for(int i = 0; i < chars.length; i++) {
            int dY = DIR.get(String.valueOf(chars[i]))[0];
            int dX = DIR.get(String.valueOf(chars[i]))[1];
            Y += dY;
            X += dX;

            if (!isValid(Y, X, LEN)) {
                return null;
            }
            score += board[Y][X];
        }
        return score;
    }
    public boolean isValid(int y, int x, int LEN) {
        return 0 <= y && y < LEN && 0 <= x && x < LEN;
    }
}
