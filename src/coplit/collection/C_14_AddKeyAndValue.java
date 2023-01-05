package coplit.collection;

import java.util.HashMap;

public class C_14_AddKeyAndValue {
    public HashMap<String, Integer> addKeyAndValue(HashMap<String, Integer> hashMap, String key, int value) {
        hashMap.put(key, value);
        return hashMap;
    }
}
