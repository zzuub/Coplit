package coplit.iteration;

public class I_05_MakeDigits {
    public String makeDigits(int num){
        String result = "";

        for(int i = 1; i<=num; i++){
            result = result + i;
        }
        return result;
    }
}
