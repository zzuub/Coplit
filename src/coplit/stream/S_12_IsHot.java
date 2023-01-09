package coplit.stream;

import java.util.Arrays;

public class S_12_IsHot {
    public boolean isHot(int[] temperature) {
        if (temperature.length != 7) {
            return false;
        }

        long hotDays = Arrays.stream(temperature)
                .filter(temp -> temp >= 30)
                .count();

        if (hotDays >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
