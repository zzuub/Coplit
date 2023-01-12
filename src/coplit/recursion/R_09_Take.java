package coplit.recursion;

import java.util.Arrays;

public class R_09_Take {
    public int[]  take(int num, int[] arr){
        if(num >= arr.length){
            return arr;
        }

        if(num == 0 || arr.length == 0){
            return new int[]{};
        }

        int[] tail = Arrays.copyOfRange(arr, 0, arr.length -1);

        return take(num, tail);
    }
}
