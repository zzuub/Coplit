package coplit.collection;

import java.util.HashMap;

public class C_18_AddEvenValues {
    public int addOddValues(HashMap<Character, Integer> hashMap) {
        int result = 0;

        for(Character key : hashMap.keySet()) {
            Integer value = hashMap.get(key);

            if(value % 2 == 0){
                result += value;
            }
        }
        return result;
    }
}

