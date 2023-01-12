package coplit.recursion;

import java.util.Arrays;

public class R_08_Drop {
    public int[] drop(int num, int[] arr){
        if(num == 0 || arr.length == 0){
            return arr;
        }
        return drop(num - 1, Arrays.copyOfRange(arr, 1, arr.length));
    }
}
