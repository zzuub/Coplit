package coplit.collection;

import java.util.ArrayList;

public class C_07_RemoveFromFront {
    public Integer removeFromFront(ArrayList<Integer> arrayList) {
        if(arrayList.size() == 0){
            return null;
        }

        return arrayList.remove(0);
    }
}
