package coplit.collection;

import java.util.ArrayList;

public class C_05_AddNth {
    public ArrayList<Integer> addNth(ArrayList<Integer> arrayList, int index, int element){
        if(index < 0 || index >= arrayList.size()){
            return null;
        }
        arrayList.add(index, element);

        return arrayList;
    }
}
