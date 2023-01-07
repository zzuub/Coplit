package coplit.iteration;

public class I_03_Factorial {
    public int factorial (int num){
        int result = 1;

        for(int i = 1; i<=num;i++){
            result = result * i;
        }
        return result;
    }
}
