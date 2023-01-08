package coplit.Array;

import java.util.Arrays;

public class A_15_GetAllElementsButFirst {
    public int[] getAllElementsButFirst(int[] arr) {
        if(arr.length == 0) {
            return new int[]{};
        }
        int[] result = Arrays.copyOfRange(arr, 1, arr.length);
        return result;
    }
}
