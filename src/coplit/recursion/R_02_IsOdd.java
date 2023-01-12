package coplit.recursion;

public class R_02_IsOdd {
    public boolean isOdd(int num){
        if(num == 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        if(num < 0){
            return isOdd(-num);
        }
        return isOdd(num - 2);
    }
}
