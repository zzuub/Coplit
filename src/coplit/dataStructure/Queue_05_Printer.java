package coplit.dataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_05_Printer {
    public int queuePrinter(int bufferSize, int capacities, int[] documents) {

        //버퍼 -> 큐로 선언
        //Queue<Integer> queue = new LinkedList<>();
        //큐에 데이터 삽입(초기값 0)
        /*for(int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }*/

        //반복을 시작(더 이상 문서가 없을 경우(document.length == 0) && 대기열에 문서가 존재하지 않는 경우 (큐가 비었을경우
            //대기중인 문서가 남은경우
                //작업중인 문서와, 남은 문서중 가장 처음의 문서의 크기가 capacities보다 큰 경우
                    //문서가 이동하고, 남은 대기열에 첫번째 문서가 수용 가능하다면
                    //문서가 이동하고, 남은 대기열에 첫번째 문서가 수용 불가능하다면
                //작업중인 문서와, 남은 문서중 가장 처음의 문서의 크기가 capacities보다 작은 경우
            //대기중인 문서가 없는 경우


        int count = 0;

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < bufferSize; i++) {
            queue.add(0);
        }

        queue.poll();
        queue.add(documents[0]);    //큐의 첫번째 문서 documents
        documents = Arrays.copyOfRange(documents, 1, documents.length);
        count++;


        //반복을 시작(더 이상 문서가 없을 경우(document.length == 0) && 대기열에 문서가 존재하지 않는 경우 (큐가 비었을경우
        while(documents.length != 0 || (queue.stream().reduce(0, Integer::sum) != 0)) {
            //대기중인 문서가 남은경우
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

            }else {             //대기중인 문서가 없는 경우
                queue.poll();   //한칸이동
                queue.add(0);   //버퍼 비어있음
                count++;        //1초 지남
            }
        }
        return count;
    }
}
