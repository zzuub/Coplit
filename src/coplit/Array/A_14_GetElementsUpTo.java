package coplit.Array;

import java.util.Arrays;

public class A_14_GetElementsUpTo {
    public int[] getElementsUpTo(int[] arr, int n) {
        if (n >= arr.length) {
            return new int[]{};
        }

        int[] result = Arrays.copyOfRange(arr, 0, n);
        return result;
    }
}
