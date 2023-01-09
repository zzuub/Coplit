package coplit.stream;

import java.util.List;

public class S_07_FilterName {
    public String[] filterName(List<String> names) {
        return names.stream()
                .distinct()
                .filter(n -> n.startsWith("김"))
                .sorted()
                .toArray(String[]::new);
    }
}