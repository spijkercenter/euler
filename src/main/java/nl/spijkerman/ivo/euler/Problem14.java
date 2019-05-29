package nl.spijkerman.ivo.euler;

import nl.spijkerman.ivo.euler.helper.KV;
import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.stream.LongStream;

public class Problem14 implements Problem {

    private int getStepsFor(long n) {
        int steps = 1;
        while (n != 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            steps++;
        }
        return steps;
    }

    @Override
    public @NotNull Object run() {
        return LongStream.range(1, 1000000)
                .parallel()
                .mapToObj(i -> new KV<>(i, getStepsFor(i)))
                .max(Comparator.comparingInt(Entry::getValue))
                .map(Entry::getKey)
                .orElse(-1L);
    }


    @Override
    public @NotNull String description() {
        return "The following iterative sequence is defined for the set of positive integers:\n" +
                "\n" +
                "n → n/2 (n is even)\n" +
                "n → 3n + 1 (n is odd)\n" +
                "\n" +
                "Using the rule above and starting with 13, we generate the following sequence:\n" +
                "13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1\n" +
                "\n" +
                "It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.\n" +
                "\n" +
                "Which starting number, under one million, produces the longest chain?\n" +
                "\n" +
                "NOTE: Once the chain starts the terms are allowed to go above one million.";
    }
}
