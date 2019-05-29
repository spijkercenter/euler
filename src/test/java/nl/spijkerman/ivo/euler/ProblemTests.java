package nl.spijkerman.ivo.euler;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class ProblemTests {

    @Test
    void Problem1() {
        assertEquals(233168, new Problem1().run());
    }

    @Test
    void Problem2() {
        assertEquals(4613732L, new Problem2().run());
    }

    @Test
    void Problem3() {
        assertEquals(6857, new Problem3().run());
    }

    @Test
    void Problem4() {
        assertEquals(906609, new Problem4().run());
    }

    @Test
    void Problem5() {
        assertEquals(232792560, new Problem5().run());
    }

    @Test
    void Problem6() {
        assertEquals(25164150, new Problem6().run());
    }

    @Test
    void Problem7() {
        assertEquals(104743, new Problem7().run());
    }

    @Test
    void Problem8() {
        fail();
    }

    @Test
    void Problem9() {
        assertEquals(31875000, new Problem9().run());
    }

    @Test
    void Problem10() {
        assertEquals(142913828922L, new Problem10().run());
    }

    @Test
    void Problem11() {
        assertEquals(70600674, new Problem11().run());
    }

    @Test
    void Problem12() {
        assertEquals(76576500, new Problem12().run());
    }

    @Test
    void Problem13() {
        assertEquals("5537376230", new Problem13().run());
    }

    @Test
    void Problem14() {
        assertEquals(837799L, new Problem14().run());
    }

    @Test
    void Problem15() {
        assertEquals(137846528820L, new Problem15().run());
    }

    @Test
    void Problem16() {
        assertEquals(1366, new Problem16().run());
    }

    @Test
    void Problem17() {
        fail();
    }

    @Test
    void Problem18() {
        assertEquals(1074L, new Problem18().run());
    }

    @Test
    void Problem38() {
        assertEquals(932718654, new Problem38().run());
    }

    @Test
    void Problem67() {
        assertEquals(7273L, new Problem67().run());
    }
}
