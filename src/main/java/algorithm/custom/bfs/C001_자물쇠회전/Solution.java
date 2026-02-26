package algorithm.custom.bfs.C001_자물쇠회전;

import java.util.*;

/**
 * Custom BFS - 자물쇠 회전 (C001)
 *
 * 자물쇠 S를 T로 만들기 위한 최소 회전 횟수를 반환한다.
 * i번 자리를 회전하면 i+1번 자리도 함께 +1된다.
 * 마지막 번호는 혼자 돌릴 수 없다.
 * T를 만들 수 없으면 -1 반환.
 */
public class Solution {

    public int solution(String S, String T) {
        if (S.equals(T)) return 0;

        Queue<String> queue = new LinkedList<>();
        Map<String, Integer> visited = new HashMap<>();

        queue.offer(S);
        visited.put(S, 0);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            int cost = visited.get(current);

            for (int i = 0; i < current.length() - 1; i++) {
                String next = rotate(current, i);
                if (next.equals(T)) return cost + 1;
                if (!visited.containsKey(next)) {
                    visited.put(next, cost + 1);
                    queue.offer(next);
                }
            }
        }

        return -1;
    }

    // i번과 i+1번 자리를 동시에 +1 (9 -> 0)
    private String rotate(String s, int i) {
        char[] chars = s.toCharArray();
        chars[i] = (char) ((chars[i] - '0' + 1) % 10 + '0');
        chars[i + 1] = (char) ((chars[i + 1] - '0' + 1) % 10 + '0');
        return new String(chars);
    }
}
