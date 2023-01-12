package coplit.recursion;

import java.util.Arrays;

public class R_07_ArrLength {
    public int arrLength(int[] arr){
        if(arr.length == 0){
            return 0;
        }
        return 1 + arrLength(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
