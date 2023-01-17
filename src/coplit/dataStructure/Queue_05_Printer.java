package coplit.dataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_05_Printer {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {
        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }

        queue.poll();
        queue.add(documents[0]);
        documents = Arrays.copyOfRange(documents, 1, documents.length);
        count++;


        while(documents.length != 0 || (queue.stream().reduce(0, Integer::sum) != 0)) {
            if(documents.length != 0) {
                int sum = queue.stream().reduce(0, Integer::sum) + documents[0];
                if(sum > capacities) {

                    queue.poll();
                    sum = queue.stream().reduce(0, Integer::sum) + documents[0];

                    if(sum <= capacities) {
                        queue.add(documents[0]);
                        documents = Arrays.copyOfRange(documents, 1, documents.length);
                        count++;
                    } else {
                        queue.add(0);
                        count++;
                    }

                } else {
                    queue.poll();
                    queue.add(documents[0]);
                    documents = Arrays.copyOfRange(documents, 1, documents.length);
                    count++;
                }

            }else {
                queue.poll();
                queue.add(0);
                count++;
            }
        }
        return count;
    }
}
