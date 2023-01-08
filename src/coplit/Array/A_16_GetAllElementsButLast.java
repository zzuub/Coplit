package coplit.Array;

import java.util.Arrays;

public class A_16_GetAllElementsButLast {
    public int[] getAllElementsButLast(int[] arr) {
        if(arr.length == 0) {
            return new int[]{};
        }
        int[] result = Arrays.copyOfRange(arr, 0, arr.length - 1);
        return result;
    }
}
