package coplit.recursion;

import java.util.Arrays;

public class R_11_Or {
    public boolean or(boolean[] arr){
        if(arr.length == 0){
            return false;
        }

        boolean head = arr[0];
        boolean tail = or(Arrays.copyOfRange(arr, 1, arr.length));

        if(!head && !tail){
            return false;
        }
        return true;
    }
}
