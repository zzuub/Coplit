package coplit.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class S_13_FindPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        Stream<String> maleStream = male.stream();
        Stream<String> femaleStream = female.stream();

        Stream<String> stream = Stream.concat(maleStream, femaleStream);

        return stream.distinct()
                .filter(p -> p.startsWith(lastName))
                .sorted()
                .collect(Collectors.toList());
    }
}

