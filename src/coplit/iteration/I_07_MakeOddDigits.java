package coplit.iteration;

public class I_07_MakeOddDigits {
    public String makeOddDigits(int num){
        String result = "";

        int count = 0;
        int i = 1;
        while (count < num) {
            result = result + i;
            i = i + 2;
            count++;
        }
        return result;
    }
}
