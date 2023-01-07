package coplit.iteration;

public class I_16_GetSumOfFactors {
    public int getSumOfFactors(int num){
        int result = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                result = result + i;
            }
        }
        return result;
    }
}
