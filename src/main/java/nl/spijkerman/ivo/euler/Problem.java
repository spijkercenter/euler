package nl.spijkerman.ivo.euler;

import com.sun.istack.internal.NotNull;

import java.time.Instant;

public interface Problem {
    @NotNull int run();

    @NotNull String description();

    public static void main(String[] args) {

        Instant begin = Instant.now();
        Problem problem = new Problem1();
        System.out.println("Running " + problem.getClass().getSimpleName());
        System.out.println("\n" + problem.description());
        System.out.println("\nSolution = " + problem.run());

        Instant now = Instant.now();


    }
}
