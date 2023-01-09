package coplit.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S_10_MergeTwoStream {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        Stream<String> stream3 = Stream.concat(stream1, stream2);

        return stream3.collect(Collectors.toList());
    }
}
