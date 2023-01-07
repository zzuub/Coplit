package coplit.iteration;

public class I_12_GetMaxNumberFromString {
    public int getMaxNumberFromString(String str) {
        int maxNum = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char character = str.charAt(i);
            int num = Character.getNumericValue(character);

            if (num > maxNum) {
                maxNum = num;
            }
        }

        return maxNum;
    }
}

