package coplit.stream;

import java.util.Arrays;

public class S_09_FindLongestLength {
    public int findLongestLength(String[] strArr) {
        if(strArr.length == 0){
            return 0;
        }
        return Arrays.stream(strArr)
                .mapToInt(String::length)
                .max()
                .getAsInt();
    }
}

