package algorithm.custom.greedy.C001_자물쇠회전;

public class Solution {

    public int solution(String S, String T) {

        if (S.isEmpty()) {
            return 0;
        }

        int[] current = S.chars()
                         .map(c -> c - '0')
                         .toArray();

        int[] target = T.chars()
                         .map(c -> c - '0')
                         .toArray();

        int length = current.length;

        int result = 0;
        for (int i = 0; i < length - 1; i++) {
            int rotationCnt = (target[i] - current[i] + 10) % 10;

            result += rotationCnt;

            current[i + 1] = (current[i + 1] + rotationCnt) % 10;
        }

        if (current[length - 1] == target[length - 1]) {
            return result;
        }

        return -1;
    }
}
