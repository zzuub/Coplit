package coplit.Array;

public class A_17_GetAllelementsButNth {
    public int[] getAllElementsButNth(int[] arr, int n) {
        if (n >= arr.length) {
            return arr;
        }

        int[] result = new int[arr.length - 1];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == n) {
                continue;
            }
            result[index] = arr[i];
            index++;
        }
        return result;
    }
}
