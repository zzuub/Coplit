package coplit.Array;

public class A_03_GetNthElement {
    public int getNthElement(int[] arr, int index) {
        if(arr.length == 0){
            return -1;
        }else if(arr.length == index){
            return -2;
        }else{
            return arr[index];
        }
    }
}
