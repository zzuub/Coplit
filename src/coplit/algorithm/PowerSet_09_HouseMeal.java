package coplit.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class PowerSet_09_HouseMeal {
    public ArrayList<String[]> missHouseMeal(String[] sideDishes) {
        Stack<String> stack = new Stack<>();
        ArrayList<String[]> result = new ArrayList<>();
        Arrays.sort(sideDishes);

        result = search(stack, 0, sideDishes, result);
        result.sort((o1, o2) -> Arrays.toString(o1).compareTo(Arrays.toString(o2)));

        return result;
    }

    public ArrayList<String[]> search(Stack<String> stack, int idx, String[] sideDishes, ArrayList<String[]> result) {
        if (idx >= sideDishes.length) {
            String[] arr = stack.toArray(new String[0]);
            result.add(arr);

            return result;
        } else {
            stack.push(sideDishes[idx]);
            search(stack, idx + 1, sideDishes, result);

            stack.pop();
            search(stack, idx + 1, sideDishes, result);
        }
        return result;
    }
}
