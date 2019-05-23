package nl.spijkerman.ivo.euler.helper;

import java.util.Arrays;

public class PrimeHelper {

    public static final PrimeHelper INSTANCE = new PrimeHelper();

    private PrimeHelper() {

    }

    private boolean[] primes = {false, false};

    public synchronized boolean isPrime(int n) {
        if (n >= primes.length) {
            final int newLength = Math.max(n, primes.length) * 2;
            primes = new boolean[newLength];
            Arrays.fill(primes, true);
            primes[0] = primes[1] = false;

            for (int i = 2; i < newLength; ++i) {
                if (primes[i]) {
                    for (int j = 2; i * j < newLength; j++) {
                        primes[i * j] = false;
                    }
                }
            }
        }
        return primes[n];
    }


}
