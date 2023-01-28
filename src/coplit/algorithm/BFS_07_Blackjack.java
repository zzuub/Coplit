package coplit.algorithm;

import java.util.ArrayList;

public class BFS_07_Blackjack {
    public int blackjack(int[] cards) {
        int count = 0;
        int length = cards.length;

        for(int i = 0; i < length; i++) {
            for(int j = i + 1; j < length; j++) {
                for(int k = j + 1; k < length; k++) {
                    int number = cards[i] + cards[j] + cards[k];

                    if(isPrime(number)) count++;
                }
            }
        }
        return count;
    }

    public boolean isPrime(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
