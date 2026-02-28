package algorithm.custom.prefix_sum.C002_공평한분할;

public class Solution {

    public int solution(int[] A, int[] B) {

        int aSum = 0;
        int bSum = 0;
        for (int i = 0; i < A.length; i++) {
            aSum += A[i];
            bSum += B[i];
        }

        if (aSum != bSum) {
            return 0;
        }

        if (aSum % 2 != 0) {
            return 0;
        }

        int aHalf = aSum / 2;

        int cnt = 0;
        int aLeftSum = 0;
        int bLeftSum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            aLeftSum += A[i];
            bLeftSum += B[i];

            if ((aLeftSum == bLeftSum) && (aLeftSum == aHalf)) {
                cnt++;
            }
        }

        return cnt;
    }
}
