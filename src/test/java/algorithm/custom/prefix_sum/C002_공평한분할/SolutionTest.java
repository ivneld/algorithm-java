package algorithm.custom.prefix_sum.C002_공평한분할;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 문제_예시() {
        assertEquals(1, solution.solution(
                new int[]{1, 2, 3, 4, 10},
                new int[]{3, 0, 7, 0, 10}
        ));
    }

    @Test
    void 공평한_분할_없음() {
        assertEquals(0, solution.solution(
                new int[]{1, 2, 3},
                new int[]{1, 1, 1}
        ));
    }

    @Test
    void 공평한_분할_여러개() {
        // A = [2, 2, 2, 2], B = [2, 2, 2, 2]
        // K=2: [2,2]|[2,2] 합 4 / [2,2]|[2,2] 합 4 → 공평
        // K=1,3은 합이 다름
        assertEquals(1, solution.solution(
                new int[]{2, 2, 2, 2},
                new int[]{2, 2, 2, 2}
        ));
    }

    @Test
    void 합이_홀수인_경우() {
        // totalA = 3 (홀수) → 절반이 불가능하므로 0
        assertEquals(0, solution.solution(
                new int[]{1, 2},
                new int[]{1, 2}
        ));
    }
}
