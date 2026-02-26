package algorithm.programmers.level1.P42576_완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 Level 1 - 완주하지 못한 선수 (42576)
 */
public class Solution {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> count = new HashMap<>();

        for (String p : participant) {
            count.merge(p, 1, Integer::sum);
        }
        for (String c : completion) {
            count.merge(c, -1, Integer::sum);
        }

        return count.entrySet().stream()
                .filter(e -> e.getValue() > 0)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow();
    }
}
