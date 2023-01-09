package coplit.stream;

import java.util.List;
import java.util.stream.Collectors;

public class S_11_MakeElementDouble {
    public List<Integer> makeElementDouble(List<Integer> list) {
        return list.stream()
                .map(e->e * 2)
                .collect(Collectors.toList());
    }
}