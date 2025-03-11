package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14501_퇴사 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int line = Integer.parseInt(br.readLine());

        int[] time = new int[line+1];
        int[] pay = new int[line+1];
        int[] dp = new int[line+2];
        int max = 0;

        StringTokenizer st;
        for(int i = 1; i <= line; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            time[i] = Integer.parseInt(st.nextToken());
            pay[i] = Integer.parseInt(st.nextToken());
        }

        for(int j = 1; j <= line + 1; j++) {
            dp[j] = Math.max(max, dp[j]);

            if(j <= line && j+time[j] <= line + 1) {
                dp[j + time[j]] = Math.max(dp[j] + pay[j], dp[j + time[j]]);
            }

            max = Math.max(max, dp[j]);
        }

        System.out.println(max);
    }
}
