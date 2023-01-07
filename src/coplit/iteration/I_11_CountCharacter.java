package coplit.iteration;

public class I_11_CountCharacter {
    public int countCharacter(String str, char letter){
        int counter = 0;
        int length = str.length();

        for(int i = 0; i<length;i++){
            if(str.charAt(i) == letter){
                counter = counter + 1;
            }
        }
        return counter;
    }
}
