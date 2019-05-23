package nl.spijkerman.ivo.euler;

import java.util.stream.IntStream;

/**
 * https://projecteuler.net/problem=1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem1 implements Problem {

    public int run() {
        return IntStream.range(3, 1000)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .sum();
    }


    public String description() {
        return "If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.\n\nFind the sum of all the multiples of 3 or 5 below 1000.";
    }
}
