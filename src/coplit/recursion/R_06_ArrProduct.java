package coplit.recursion;

import java.util.Arrays;

public class R_06_ArrProduct {
    public int arrProduct(int[] arr){
        if(arr.length == 0){
            return 1;
        }
        int head = arr[0];
        int[] tail = Arrays.copyOfRange(arr, 1, arr.length);

        return head * arrProduct(tail);
    }
}
