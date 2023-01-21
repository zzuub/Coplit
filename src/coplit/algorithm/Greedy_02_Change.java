package coplit.algorithm;

public class Greedy_02_Change {
    public int change(int k) {
        int result = 0;
        int[] wallet = new int[]{500, 100, 50, 10, 5, 1};

        for(int i = 0; i < wallet.length; i++) {
            if(k > 0) {
                int sum = (int)Math.floor((double)k / wallet[i]);
                result = result + sum;
                k = k - (wallet[i] * sum);
            }
        }
        return result;
    }
}
