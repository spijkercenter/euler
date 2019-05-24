package nl.spijkerman.ivo.euler.helper;

import java.math.BigInteger;

public class PrimeHelper {
    private static boolean[] PRIMES = {false, false};
    private static final double GROW_FACTOR = 2.4;

    public static boolean isPrime(long n) {
        if (n <= Integer.MAX_VALUE)
            return isPrime((int) n);
        return calcPrime(n);
    }

    public synchronized static boolean isPrime(int n) {
        if (n >= PRIMES.length)
            preCalc((int) (n * GROW_FACTOR));
        return PRIMES[n];
    }

    private static boolean calcPrime(long n) {
        return BigInteger.valueOf(n).isProbablePrime(100);
    }


    private synchronized static void preCalc(int n) {
        if (n < PRIMES.length)
            return;

        System.out.printf("Calculating primes. oldCount = %d, newCount = %d%n", PRIMES.length, n);
        boolean[] oldPrimes = PRIMES;
        PRIMES = new boolean[n];
        System.arraycopy(oldPrimes, 0, PRIMES, 0, oldPrimes.length);
        for (int i = oldPrimes.length; i < n; ++i) {
            PRIMES[i] = calcPrime(i);
        }
    }
}
