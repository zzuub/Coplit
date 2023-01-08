package coplit.Array;

public class A_05_GetAllWords {
    public String[] getAllWords(String str) {
        if(str.isEmpty()){
            return new String[]{};
        }
        return str.split(" ");
    }
}
