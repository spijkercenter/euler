package nl.spijkerman.ivo.euler;

import nl.spijkerman.ivo.euler.helper.PrimeHelper;
import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class Problem3 implements Problem {
    @Override
    public @NotNull Object run() {

        long value = 600851475143L;
        int sqrt = (int) Math.sqrt(value);
        return IntStream.rangeClosed(2, sqrt)
                .parallel()
                .filter(PrimeHelper::isPrime)
                .filter(i -> value % i == 0)
                .max()
                .orElse(-1);
    }

    @Override
    public @NotNull String description() {
        return "The prime factors of 13195 are 5, 7, 13 and 29.\n" +
                "\n" +
                "What is the largest prime factor of the number 600851475143 ?";
    }
}
