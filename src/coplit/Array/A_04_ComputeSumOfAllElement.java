package coplit.Array;

public class A_04_ComputeSumOfAllElement {
    public int computeSumOfAllElements(int[] arr) {
        int sum =0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
