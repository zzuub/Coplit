package coplit.iteration;

public class I_10_FindTheBug {
    public int findTheBug(String word){
        for(int i = 0; i <word.length(); i++){
            if (word.charAt(i) == '#'){
                return i;
            }
        }
        return -1;
    }
}
