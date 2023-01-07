package coplit.iteration;

public class I_08_MakeMultipulesOfDigit {
    public String makeMultiplesOfDigit(int num){
        String result = "";

        for(int i = 1; i<=num; i++){
            if(i % 3 == 0){
                result = result + i;
            }
        }
        return result;
    }
}
