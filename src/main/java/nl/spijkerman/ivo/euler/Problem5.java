package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class Problem5 implements Problem {

    @Override
    public @NotNull Object run() {
        return IntStream.iterate(1, i -> i + 1)
                .filter(i -> {
                    for (int j = 1; j <= 20; ++j)
                        if (i % j != 0)
                            return false;
                    return true;
                }).findFirst()
                .orElse(-1);

    }

    @Override
    public @NotNull String description() {
        return "2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.\n" +
                "\n" +
                "What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?";
    }
}
