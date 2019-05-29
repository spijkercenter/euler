package nl.spijkerman.ivo.euler;


import org.jetbrains.annotations.NotNull;

import java.time.Duration;
import java.time.Instant;

public interface Problem {

    @NotNull
    Object run();


    @NotNull
    String description();

    static void main(String[] args) {

        Instant begin = Instant.now();
        Problem problem = new Problem38();
        System.out.println("Running " + problem.getClass().getSimpleName());
        System.out.println("\n" + problem.description());
        System.out.println("\nSolution = " + problem.run());

        Instant now = Instant.now();
        long millis = Duration.between(begin, now).toMillis();
        System.out.printf("Solved in %ds%dms%n", millis / 1000, millis % 1000);

    }
}
