package coplit.Array;

public class A_08_GetLongestWord {
    public String getLongestWord(String str) {
        String[] words = str.split(" ");

        String max = words[0];
        for(int i=0; i<words.length;i++){
            if(max.length() < words[i].length()){
                max = words[i];
            }
        }
        return max;
    }
}
