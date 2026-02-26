package algorithm.custom.kmp.C003_prefix이면서suffix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void 문제_예시() {
        assertEquals(4, solution.solution("ababab"));
    }

    @Test
    void prefix_suffix_없음() {
        assertEquals(0, solution.solution("abcdef"));
    }

    @Test
    void 단일_문자_반복() {
        // "aaaa" → prefix이자 suffix인 가장 긴 것은 "aaa" → 3
        assertEquals(3, solution.solution("aaaa"));
    }

    @Test
    void 단일_문자() {
        assertEquals(0, solution.solution("a"));
    }

    @Test
    void 앞뒤_같은_패턴() {
        // "abcabc" → "abc"가 prefix이자 suffix → 3
        assertEquals(3, solution.solution("abcabc"));
    }
}
