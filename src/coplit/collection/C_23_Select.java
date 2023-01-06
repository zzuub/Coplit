package coplit.collection;

import java.util.HashMap;

public class C_23_Select {
    public HashMap<String, Integer> select(String[] arr, HashMap<String, Integer> hashMap) {
        HashMap<String, Integer> newHashMap = new HashMap<>();

        for(String str : arr){
            if(hashMap.containsKey(str)){
                newHashMap.put(str, hashMap.get(str));
            }
        }
        return newHashMap;
    }
}
