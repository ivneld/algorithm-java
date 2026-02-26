package algorithm.custom.kmp.C003_prefix이면서suffix;

/**
 * Custom KMP - prefix이면서 suffix (C003)
 *
 * 주어진 문자열에서 전체 문자열이 아니면서
 * prefix이자 suffix인 부분 문자열 중 가장 긴 것의 길이를 반환한다.
 * KMP 알고리즘의 실패 함수(pi 배열)를 활용한다.
 */
public class Solution {

    public int solution(String s) {
        int n = s.length();
        int[] pi = buildPi(s);
        return pi[n - 1];
    }

    // KMP 실패 함수: pi[i] = s[0..i]에서 prefix == suffix인 최대 길이
    private int[] buildPi(String s) {
        int n = s.length();
        int[] pi = new int[n];
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = pi[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                pi[i] = ++j;
            }
        }

        return pi;
    }
}
