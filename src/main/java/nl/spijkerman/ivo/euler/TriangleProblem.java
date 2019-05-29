package nl.spijkerman.ivo.euler;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public abstract class TriangleProblem implements Problem {

    abstract long[][] getTriangle();

    @Override
    public final @NotNull Object run() {
        final long[][] triangle = getTriangle();

        for (int y = 1; y < triangle.length; ++y) {
            long[] cRow = triangle[y];
            long[] pRow = triangle[y - 1];
            for (int x = 0; x < cRow.length; ++x) {
                long left = -1, right = -1;
                if (x > 0)
                    left = pRow[x - 1];
                if (x < pRow.length)
                    right = pRow[x];
                if (left >= right)
                    cRow[x] += left;
                else
                    cRow[x] += right;
            }
        }

        return Arrays
                .stream(triangle[triangle.length - 1])
                .max()
                .orElse(-1L);
    }
}
