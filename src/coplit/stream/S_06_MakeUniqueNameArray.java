package coplit.stream;

import java.util.List;

public class S_06_MakeUniqueNameArray {
    public String[] makeUniqueNameArray(List<String> names) {
        return names.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}