package coplit.iteration;

public class I_15_ComputerPower {
    public int computerPower(int base, int exponent){
        int result = 1;

        for (int i = 0; i < exponent; i++){
            result = result * base;
        }
        return result;
    }
}
