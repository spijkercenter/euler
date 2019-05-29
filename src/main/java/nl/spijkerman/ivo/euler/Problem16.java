package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Problem16 implements Problem {
    @Override
    public @NotNull Object run() {
        return BigInteger.valueOf(2L)
                .pow(1000)
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

    @Override
    public @NotNull String description() {
        return "215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.\n" +
                "\n" +
                "What is the sum of the digits of the number 21000?";
    }
}
