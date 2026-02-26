package algorithm.custom.greedy.C001_자물쇠회전;

/**
 * Custom Greedy - 자물쇠 회전 (C001)
 *
 * 자물쇠 S를 T로 만들기 위한 최소 회전 횟수를 반환한다.
 * i번 자리를 회전하면 i+1번 자리도 함께 +1된다.
 * 마지막 번호는 혼자 돌릴 수 없다.
 * T를 만들 수 없으면 -1 반환.
 */
public class Solution {

    public int solution(String S, String T) {
        if (S.length() != T.length()) return -1;
        int n = S.length();
        int[] s = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = S.charAt(i) - '0';
            t[i] = T.charAt(i) - '0';
        }

        int total = 0;
        int prev = 0; // 이전 위치의 회전 횟수 r_{i-1}

        for (int i = 0; i < n - 1; i++) {
            // (s[i] + prev + r_i) mod 10 = t[i]
            int r = ((t[i] - s[i] - prev) % 10 + 10) % 10;
            total += r;
            prev = r;
        }

        // 마지막 자리 검증: (s[n-1] + prev) mod 10 == t[n-1]
        if ((s[n - 1] + prev) % 10 != t[n - 1]) return -1;

        return total;
    }
}
