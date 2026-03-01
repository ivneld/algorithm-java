package algorithm.baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String P = br.readLine();

        char[] s = S.toCharArray();
        char[] p = P.toCharArray();

        int m = p.length;

        int[] pi = buildPi(p);

        int j = 0;
        for (char c : s) {
            while (j > 0 && c != p[j]) {
                j = pi[j - 1];
            }
            if (c == p[j]) {
                j++;
                if (j == m) {
                    System.out.println(1);
                    return;
                }
            }
        }

        System.out.println(0);
    }

    private static int[] buildPi(char[] p) {
        int m = p.length;
        int[] pi = new int[m];
        int j = 0;
        for (int i = 1; i < m; i++) {
            while (j > 0 && p[i] != p[j]) {
                j = pi[j - 1];
            }
            if (p[i] == p[j]) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
}