package coplit.collection;

import java.util.ArrayList;

public class C_06_ModifyNthElement {
    public ArrayList<String> modifyNthElement(ArrayList<String> arrayList, int index, String str) {
        if (index < 0 || index >= arrayList.size()) {
            return null;
        }

        arrayList.set(index, str);

        return arrayList;
    }
}
