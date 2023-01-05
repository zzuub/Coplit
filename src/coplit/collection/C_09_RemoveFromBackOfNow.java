package coplit.collection;

import java.util.ArrayList;

public class C_09_RemoveFromBackOfNow {
    public ArrayList<Integer> removeFromBackOfNew(ArrayList<Integer> arrayList) {
        int size = arrayList.size();
        if (size == 0){
            return null;
        }
        ArrayList<Integer> newArrayList = new ArrayList<>(arrayList);
        newArrayList.remove(size -1);

        return newArrayList;
    }
}
