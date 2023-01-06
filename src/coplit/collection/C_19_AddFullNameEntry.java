package coplit.collection;

import java.util.HashMap;

public class C_19_AddFullNameEntry {
    public HashMap<String, String> addFullNameEntry(HashMap<String, String> hashMap) {
        String firstName = hashMap.get("firstName");
        String lastName = hashMap.get("lastName");

        hashMap.put("fullName", firstName + lastName);

        return hashMap;
    }
}

