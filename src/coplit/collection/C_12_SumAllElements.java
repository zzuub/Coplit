package coplit.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C_12_SumAllElements {
    public int sumAllElements(ArrayList<Integer> arrayList) {

        int total = 0;

        if(arrayList.size() == 0){
            return 0;
        }

        Iterator<Integer> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next();
            total += next;
        }
        return total;
    }
}
