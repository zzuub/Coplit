package coplit.collection;

import java.util.ArrayList;

public class C_02_GetNthElement {
    public Integer getNthElement(ArrayList<Integer> arrayList, int index) {
        int size = arrayList.size();

        if(size == 0){
            return null;
        }

        if (index < 0 || index >= size){
            return null;
        }
        return arrayList.get(index);
    }
}

