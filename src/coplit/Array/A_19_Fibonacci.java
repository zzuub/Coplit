package coplit.Array;

public class A_19_Fibonacci {
    public int[] fibonacci(int num) {
        int[] array = new int[num + 1];

        for(int i = 0; i <= num; i++) {
            if(i <= 1) {
                array[i] = i;
            }else {
                array[i] = array[i - 2] + array[i - 1];
            }
        }
        return array;
    }
}
