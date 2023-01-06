package coplit.collection;

import java.util.HashMap;

public class C_24_CountAllCharacters {
    public HashMap<Character, Integer> countAllCharacter(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(int i= 0; i<str.length();i++){
            char cc = str.charAt(i);

            if(!hashMap.containsKey(cc)) hashMap.put(cc, 1);
            else hashMap.put(cc, hashMap.get(cc) + 1);
        }
        return str.isEmpty() ? null : hashMap;
    }
}

