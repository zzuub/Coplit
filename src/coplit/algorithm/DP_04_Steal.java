package coplit.algorithm;

public class DP_04_Steal {
    public long steal(int target, int[] type) {
        long[] bag = new long[target + 1];
        bag[0] = 1;

        for(int i = 0; i < type.length; i++) {
            for(int j = 1; j <= target; j++)
                if(type[i] <= j)
                    bag[j] += bag[j-type[i]];
        }
        return bag[target];
    }
}
