package algorithm.programmers.level1.P42576_완주하지못한선수;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 기본_케이스() {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        assertEquals("leo", solution.solution(participant, completion));
    }

    @Test
    void 동명이인_케이스() {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        assertEquals("vinko", solution.solution(participant, completion));
    }

    @Test
    void 동명이인_중복_케이스() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        assertEquals("mislav", solution.solution(participant, completion));
    }
}
