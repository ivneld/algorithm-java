package algorithm.baekjoon.silver.B1000_A더하기B;

import java.util.Scanner;

/**
 * 백준 Silver - A+B (1000)
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }

    public int solve(int a, int b) {
        return a + b;
    }
}
