package algorithm.custom.prefix_sum.C002_공평한분할;

/**
 * Custom Prefix Sum - 공평한 분할 (C002)
 *
 * 길이가 같은 두 배열 A, B를 위치 K에서 분할했을 때
 * 네 구간합(A 왼쪽, A 오른쪽, B 왼쪽, B 오른쪽)이 모두 같은
 * K의 개수를 반환한다. (1 <= K <= N-1)
 */
public class Solution {

    public int solution(int[] A, int[] B) {
        int n = A.length;

        int totalA = 0, totalB = 0;
        for (int x : A) totalA += x;
        for (int x : B) totalB += x;

        int count = 0;
        int prefixA = 0, prefixB = 0;

        for (int k = 1; k < n; k++) {
            prefixA += A[k - 1];
            prefixB += B[k - 1];

            // 네 구간합이 모두 같으려면:
            // prefixA == totalA - prefixA  →  2 * prefixA == totalA
            // prefixB == totalB - prefixB  →  2 * prefixB == totalB
            // prefixA == prefixB
            if (2 * prefixA == totalA && 2 * prefixB == totalB && prefixA == prefixB) {
                count++;
            }
        }

        return count;
    }
}
