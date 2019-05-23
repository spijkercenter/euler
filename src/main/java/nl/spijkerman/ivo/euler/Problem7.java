package nl.spijkerman.ivo.euler;

import nl.spijkerman.ivo.euler.helper.PrimeHelper;
import org.jetbrains.annotations.NotNull;

public class Problem7 implements Problem {

    @Override
    public @NotNull Object run() {
        int primes = 2;
        PrimeHelper ph = PrimeHelper.INSTANCE;
        int i = 3;
        for (; primes < 10001; i += 2)
            if (ph.isPrime(i))
                primes++;

        return i;
    }

    @Override
    public @NotNull String description() {
        return "By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.\n" +
                "\n" +
                "What is the 10 001st prime number?";
    }
}
