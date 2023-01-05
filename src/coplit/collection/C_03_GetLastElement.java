package coplit.collection;

import java.util.ArrayList;

public class C_03_GetLastElement {
    public String getLastElement(ArrayList<String> arrayList) {
        int size = arrayList.size();

        if (size == 0) {
            return null;
        }

        return arrayList.get(size - 1);
    }
}
