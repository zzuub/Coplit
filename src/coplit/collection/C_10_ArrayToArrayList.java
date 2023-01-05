package coplit.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_10_ArrayToArrayList {
    public List<String> arrayToArrayList(String[] arr) {
        if(arr.length == 0){
            return null;
        }
        return  new ArrayList<String>(Arrays.asList(arr));
    }
}
