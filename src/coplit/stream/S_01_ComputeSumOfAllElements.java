package coplit.stream;

import java.util.List;

public class S_01_ComputeSumOfAllElements {
    public int computeSumOfAllElements(List<Integer> list){
        return list.stream()
                .mapToInt(m -> m)
                .sum();
    }
}