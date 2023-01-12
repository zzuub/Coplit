package coplit.recursion;

public class R_04_Fibonacci {
    public int fibonacci(int num){
        if(num <= 1){
            return num;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}
