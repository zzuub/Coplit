package coplit.Array;

import java.util.Arrays;

public class A_13_GetElementsAfter {
    public int[] getElementsAfter(int[] arr, int n) {
        if (n >= arr.length) {
            return new int[]{};
        }

        int[] result = Arrays.copyOfRange(arr, n, arr.length);
        return result;
    }
}
