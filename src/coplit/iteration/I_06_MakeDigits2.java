package coplit.iteration;

public class I_06_MakeDigits2 {
    public String makeDigits2(int num){
        String result = "1";

        int i = 2;
        while(i<=num){
            result = result + "-" + i;
            i++;
        }
        return result;
    }
}
