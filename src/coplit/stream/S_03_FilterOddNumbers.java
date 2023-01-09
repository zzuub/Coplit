package coplit.stream;

import java.util.List;
import java.util.stream.Collectors;

public class S_03_FilterOddNumbers {
    public List<Integer> filterOddNumbers(List<Integer> list){
        return list.stream()
                .filter(f -> f % 2 == 0)
                .collect(Collectors.toList());
    }
}

