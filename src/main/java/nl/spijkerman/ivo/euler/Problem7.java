package nl.spijkerman.ivo.euler;

import nl.spijkerman.ivo.euler.helper.PrimeHelper;
import org.jetbrains.annotations.NotNull;

public class Problem7 implements Problem {

    @Override
    public @NotNull Object run() {
        int primes = 1;
        int i = 3;
        int lastPrime = 2;
        for (; primes < 10_001; i += 2)
            if (PrimeHelper.isPrime(i)) {
                lastPrime = i;
                primes++;
            }

        return lastPrime;
    }

    @Override
    public @NotNull String description() {
        return "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.\n" +
                "\n" +
                "What is the 10 001st prime number?";
    }
}
