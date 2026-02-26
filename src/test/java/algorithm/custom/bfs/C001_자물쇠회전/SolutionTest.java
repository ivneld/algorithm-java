package algorithm.custom.bfs.C001_자물쇠회전;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 이미_같은_경우() {
        assertEquals(0, solution.solution("12345", "12345"));
    }

    @Test
    void 한번_회전() {
        assertEquals(1, solution.solution("11111", "22111"));
    }

    @Test
    void 자리올림_포함_회전() {
        assertEquals(1, solution.solution("90909", "01909"));
    }

    @Test
    void 만들_수_없는_경우() {
        assertEquals(-1, solution.solution("115", "116"));
    }
}
