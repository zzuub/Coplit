package coplit.recursion;

public class R_01_SumTo {
    public int sumTo(int num){
        if(num == 0){
            return 0;
        }
        return num + sumTo(num -1);
    }
}
