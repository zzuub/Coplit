package coplit.algorithm;

import java.util.Arrays;

public class Greedy_01_MovingStuff {
    public int movingStuff(int[] stuff, int limit) {
        int twoStuff = 0;
        Arrays.sort(stuff);

        int leftIdx = 0;
        int rightIdx = stuff.length - 1;

        while (leftIdx < rightIdx) {
            if (stuff[leftIdx] + stuff[rightIdx] <= limit) {
                leftIdx++;
                rightIdx--;
                twoStuff++;
            } else {
                rightIdx--;
            }
        }
        return stuff.length - twoStuff;
    }
}
