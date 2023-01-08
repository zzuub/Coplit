package coplit.Array;

import java.util.Arrays;

public class A_09_GetEvenNumbers {
    public int[] getEvenNumbers(int[] arr) {
        int[] odd = new int[]{};

        if(arr.length == 0){
            return new int[]{};
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                odd = Arrays.copyOf(odd, odd.length + 1);
                odd[odd.length -1] = arr[i];
            }
        }
        return odd;
    }
}
