package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1699_제곱수의_합 {

    public static int solution(int n) {
        int basket[] = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            basket[i] = i;
            for (int j = 1; j * j <= i; j++) {
                if (basket[i] > basket[i - j * j] + 1) {
                    basket[i] = basket[i - j * j] + 1;
                }
            }
        }
        return basket[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));
    }
}
