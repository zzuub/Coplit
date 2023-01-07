package coplit.iteration;

public class I_18_ListPrimes {
    public String listPrimes(int num) {
        String result = "2";
        for (int candi = 3; candi <= num; candi += 2) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(candi);

            for (int divider = 3; divider <= sqrt; divider += 2) {
                if (candi % divider == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                result = result + "-" + candi;
            }
        }
        return result;
    }
}
