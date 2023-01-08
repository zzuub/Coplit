package coplit.Array;

import java.util.Arrays;

public class A_18_CreatePhoneNumber {
    public String createPhoneNumber(int[] arr) {
        String head = "010";
        int len = arr.length;
        String bodyArr = Arrays.toString(Arrays.copyOfRange(arr, len - 8, len - 4));
        String body = bodyArr
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");
        String tailArr = Arrays.toString(Arrays.copyOfRange(arr, len - 4, len));
        String tail = tailArr
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replace("[", "")
                .replace("]", "");

        if (len == 11) {
            String headArr = Arrays.toString(Arrays.copyOfRange(arr, 0, 3));
            head = headArr
                    .replaceAll(" ", "")
                    .replaceAll(",", "")
                    .replace("[", "")
                    .replace("]", "");
        }
        return String.format("(%s)%s-%s", head, body, tail);
    }
}
