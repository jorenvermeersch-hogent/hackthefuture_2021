package cases;

import java.util.ArrayList;
import java.util.List;

public class case83 {
    // Find all the primes between the start and end index (both inclusive)
    // 31328,\"end\":31428
    public static void main(String[] args) {
        new case83().run();
    }

    public void run() {
        zeef(31328, 31428);
    }

    public void zeef(int start, int end) {
        boolean prime[] = new boolean[end + 1];
        for (int ind = 0; ind <= end; ind++)
            prime[ind] = true;

        for (int p = 2; p * p <= end; p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * p; i <= end; i += p)
                    prime[i] = false;
            }
        }

        List<Integer> prime_numbers = new ArrayList<>();

        for (int num = 2; num <= end; num++) {
            if (prime[num] == true && num >= start)
                prime_numbers.add(num);
        }

        System.out.println(prime_numbers);
    }

}
