package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problem15 implements Problem {

    @Override
    public @NotNull Object run() {
        // [1][1][1]
        // [1][2][3]
        // [1][3][6]


        int dim = 20;
        dim++;
        long[][] nodes = new long[dim][dim];

        for (int y = 0; y < dim; ++y) {
            for (int x = 0; x < dim; ++x) {
                if (x == 0 || y == 0)
                    nodes[x][y] = 1;
                else
                    nodes[x][y] = nodes[x-1][y] + nodes[x][y-1];
            }
        }
        dim--;
        return nodes[dim][dim];
    }

    @Override
    public @NotNull String description() {
        return "Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, there are exactly 6 routes to the bottom right corner.\n" +
                "\n" +
                "How many such routes are there through a 20×20 grid?";
    }
}
