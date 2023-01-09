package coplit.stream;

import java.util.List;

public class S_02_ComputeAverageOfNumbers {
    public double computeAverageOfNumbers(List<Integer> list) {
        return list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
