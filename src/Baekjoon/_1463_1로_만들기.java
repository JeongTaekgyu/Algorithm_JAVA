package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1463_1로_만들기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int dp[] = new int[n + 1];
        dp[0] = dp[1] = 0;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // 1을 빼는 경우
            if( i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1); // 2로 나누는 경우
            }
            if( i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1); // 3으로 나누는 경우
            }
        }

        System.out.println(dp[n]);
    }

}
