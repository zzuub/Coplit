package coplit.iteration;

public class I_19_MakePermutations {
    public String makePermutations(String str) {
        String result = "";

        if(str.isEmpty()) {
            return  "";
        }

        for (int left = 0; left < str.length(); left++) {
            for (int right = 0; right < str.length(); right++) {
                result = result + str.charAt(left) + str.charAt(right) + ",";
            }
        }
        return result.substring(0, result.length() -1);
    }
}
