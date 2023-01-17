package coplit.dataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_04_BoxesPackaging {
    public int paveBox(Integer[] boxes) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(boxes));

        Integer first = queue.poll();
        int result = 1;
        int count = 1;

        while(queue.peek() != null){
            Integer compare = queue.poll();

            if(first < compare){
                result = Math.max(result, count);
                count = 1;
                first = compare;
            }
            else{
                count ++;

                if(queue.isEmpty()){
                    result = Math.max(result, count);
                }
            }
        }
        return result;
    }
}
