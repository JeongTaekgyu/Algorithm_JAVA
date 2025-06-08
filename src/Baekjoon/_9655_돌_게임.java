package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9655_돌_게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[] = new int[1001];
        dp[1] = 1; // SK 승
        dp[2] = 2; // CY 승
        dp[3] = 1; // SK 승
        for(int i = 4; i <= n; i++){
            dp[i] = Math.min(dp[i-1], dp[i-3]) + 1;
        }

        if(dp[n] % 2 == 0){
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
