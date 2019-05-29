package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem38 implements Problem {


    @Override
    public @NotNull Object run() {

        return IntStream.range(1, 10000)
                .mapToObj(i -> {
                    StringBuilder sb = new StringBuilder("" + i + (i * 2));
                    for (int m = 3; sb.length() < 9; ++m)
                        sb.append(i * m);
                    return sb.toString();
                })
                .filter(i -> i.length() == 9 &&
                        !i.contains("0") &&
                        i.chars().boxed().collect(Collectors.toSet()).size() == 9)
                .mapToInt(Integer::parseInt)
                .max()
                .orElseThrow(IllegalStateException::new);
    }

    @Override
    public @NotNull String description() {
        return "Take the number 192 and multiply it by each of 1, 2, and 3:\n" +
                "\n" +
                "    192 × 1 = 192\n" +
                "    192 × 2 = 384\n" +
                "    192 × 3 = 576\n" +
                "\n" +
                "By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576 the concatenated product of 192 and (1,2,3)\n" +
                "\n" +
                "The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).\n" +
                "\n" +
                "What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated product of an integer with (1,2, ... , n) where n > 1?";
    }
}
