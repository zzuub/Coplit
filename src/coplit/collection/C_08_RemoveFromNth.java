package coplit.collection;

import java.util.ArrayList;

public class C_08_RemoveFromNth {
    public String removeFromNth(ArrayList<String> arrayList, int index) {
        if(arrayList.size() == 0){
            return null;
        }
        if(index <0 || index >= arrayList.size()){
            return null;
        }
        return arrayList.remove(index);
    }
}
