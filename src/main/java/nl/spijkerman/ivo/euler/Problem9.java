package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

public class Problem9 implements Problem {

    @Override
    public @NotNull Object run() {
        for (int a = 1; a < 1000; ++a) {
            for (int b = a + 1; b + a < 1000; ++b) {
                int c = 1000 - a - b;
                if (a * a + b * b == c * c)
                    return a * b * c;
            }
        }
        return -1;
    }

    @Override
    public @NotNull String description() {
        return "A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,\n" +
                "a2 + b2 = c2\n" +
                "\n" +
                "For example, 32 + 42 = 9 + 16 = 25 = 52.\n" +
                "\n" +
                "There exists exactly one Pythagorean triplet for which a + b + c = 1000.\n" +
                "Find the product abc.";
    }
}
