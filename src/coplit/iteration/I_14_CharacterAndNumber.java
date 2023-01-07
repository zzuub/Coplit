package coplit.iteration;

public class I_14_CharacterAndNumber {
    public String characterAndNumber(String word){
        String result = "";
        for (int i = 0; i<word.length(); i++){
            result = result + word.charAt(i) + i;
        }
        return result;
    }
}
