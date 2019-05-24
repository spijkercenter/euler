package nl.spijkerman.ivo.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ProblemTests {

    @Test
    void Problem1() {
        assertEquals(233168, (int) new Problem1().run());
    }

    @Test
    void Problem2() {
        assertEquals(4613732L, (long) new Problem2().run());
    }

    @Test
    void Problem3() {
        assertEquals(6857, (int) new Problem3().run());
    }

    @Test
    void Problem4() {
        assertEquals(906609, (int) new Problem4().run());
    }

    @Test
    void Problem5() {
        assertEquals(232792560, (int) new Problem5().run());
    }

    @Test
    void Problem6() {
        assertEquals(25164150, (int) new Problem6().run());
    }

    @Test
    void Problem7() {
        assertEquals(104743, (int) new Problem7().run());
    }

    @Test
    void Problem8() {
        fail();
    }

    @Test
    void Problem9() {
        assertEquals(31875000, (int) new Problem9().run());
    }

    @Test
    void Problem10() {
        assertEquals(142913828922L, (long) new Problem10().run());
    }

    @Test
    void Problem11() {
        assertEquals(70600674, (int) new Problem11().run());
    }

    @Test
    void Problem12() {
        assertEquals(76576500, (int) new Problem12().run());
    }

    @Test
    void Problem13() {
        assertEquals("5537376230", new Problem13().run());
    }

    @Test
    void Problem14() {
        assertEquals(837799L, new Problem14().run());
    }
}
