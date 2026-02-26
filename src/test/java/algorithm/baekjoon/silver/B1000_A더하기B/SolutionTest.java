package algorithm.baekjoon.silver.B1000_A더하기B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 기본_케이스() {
        assertEquals(3, solution.solve(1, 2));
    }

    @Test
    void 음수_포함_케이스() {
        assertEquals(-1, solution.solve(-3, 2));
    }

    @Test
    void 영_포함_케이스() {
        assertEquals(5, solution.solve(0, 5));
    }
}
