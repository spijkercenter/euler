package nl.spijkerman.ivo.euler;

import nl.spijkerman.ivo.euler.helper.PrimeHelper;
import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Problem10 implements Problem {

    @Override
    public @NotNull Object run() {
        final Random random = new Random();

        return LongStream.range(1, 2_000_000)
//                .parallel()
                .filter(PrimeHelper::isPrime)
                .sum();
    }

    @Override
    public @NotNull String description() {
        return "The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.\n" +
                "\n" +
                "Find the sum of all the primes below two million.";
    }
}
