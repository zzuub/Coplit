package coplit.stream;

import java.util.Arrays;

public class S_08_FindBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        return Arrays.stream(arr)
                .max()
                .getAsInt();
    }
}