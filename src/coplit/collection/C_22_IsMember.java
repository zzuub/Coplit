package coplit.collection;

import java.util.HashMap;

public class C_22_IsMember {
    public boolean isMember(HashMap<String, String> member, String username, String password) {
        if(!member.containsKey(username)) {
            return false;
        }
        return member.get(username).equals(password);
    }
}
