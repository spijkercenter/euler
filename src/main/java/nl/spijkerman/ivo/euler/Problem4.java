package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.util.stream.IntStream;

public class Problem4 implements Problem {

    private boolean isPalindrome(int input) {
        String ltr = input + "";
        String rtl = new StringBuilder(ltr).reverse().toString();
        return ltr.equals(rtl);
    }

    @Override
    public @NotNull Integer run() {

        return IntStream.rangeClosed(111, 999)
                .flatMap(lhs -> IntStream.rangeClosed(111, 999)
                        .map(rhs -> lhs * rhs))
                .filter(this::isPalindrome)
                .max()
                .orElse(-1);
    }

    @Override
    public @NotNull String description() {
        return "A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.\n" +
                "\n" +
                "Find the largest palindrome made from the product of two 3-digit numbers.";
    }
}
