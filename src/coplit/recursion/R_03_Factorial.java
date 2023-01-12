package coplit.recursion;

public class R_03_Factorial {
    public int factorial(int num){
        if(num == 0){
            return 1;
        }
        return num * factorial(num -1);
    }
}
