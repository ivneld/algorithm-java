package algorithm.baekjoon.platinum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String p = br.readLine();

        char[] charArray = p.toCharArray();
        int[] piArray = new int[n];
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && charArray[i] != charArray[j]) {
                j = piArray[j - 1];
            }

            if (charArray[i] == charArray[j]) {
                ++j;
                piArray[i] = j;
            } else {
                piArray[i] = 0;
            }
        }

        int answer = n - piArray[n - 1];

        System.out.println(answer);
    }
}
