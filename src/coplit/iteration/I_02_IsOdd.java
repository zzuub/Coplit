package coplit.iteration;

public class I_02_IsOdd {
    public boolean isOdd(int num){
        if(num<0){
            num = -num;
        }
        while (num > 0){
            if (num == 1){
                return true;
            }
            num = num - 2;
        }
        return false;
    }
}
