package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class Problem6 implements Problem {

    @Override
    public @NotNull Object run() {
        Supplier<IntStream> range = () -> IntStream.rangeClosed(1, 100);
        long sumOfSquares = range.get()
                .map(i -> i * i)
                .sum();
        long squareOfSum = (long) Math.pow(range.get().sum(), 2);
        return squareOfSum - sumOfSquares;
    }

    @Override
    public @NotNull String description() {
        return "The sum of the squares of the first ten natural numbers is,\n" +
                "12 + 22 + ... + 102 = 385\n" +
                "\n" +
                "The square of the sum of the first ten natural numbers is,\n" +
                "(1 + 2 + ... + 10)2 = 552 = 3025\n" +
                "\n" +
                "Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.\n" +
                "\n" +
                "Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.";
    }
}
