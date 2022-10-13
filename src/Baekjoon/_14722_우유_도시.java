package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14722_우유_도시 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n+1][n+1];
        int[][][] dp = new int[n+1][n+1][3];
        int maxCount = 0;

        StringTokenizer st;
        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int currentMilk = arr[i][j];    // 현재 위치의 우유

                // 우류 마시는 순서 딸기(0) -> 초코(1) -> 바나나(2) -> 0 ...
                if(currentMilk == 0){   // 현재 우유가 딸기이면 이전(바나나)까지 마신우유 + 1
                    dp[i][j][0] = Math.max(dp[i][j-1][2] + 1, dp[i-1][j][2] + 1);
                } else { // 그게 아니면 이전에 딸기를 먹었을 때 합을 유지한다.
                    dp[i][j][0] = Math.max(dp[i][j-1][0], dp[i-1][j][0]);
                }

                if(currentMilk == 1 &&  // 현재 우유가 초코이고
                        dp[i][j][0] > dp[i][j][1]) // 이전에 딸기(0)을 마셨다면
                {   // 이전 까지 마신 우유 + 1
                    dp[i][j][1] = Math.max(dp[i][j-1][0] + 1, dp[i-1][j][0] + 1);
                } else {    // 그게 아니면 이전에 초코를 먹었을 때 합을 유지한다.
                    dp[i][j][1] = Math.max(dp[i][j-1][1], dp[i-1][j][1]);
                }

                if(currentMilk == 2 &&  // 현재 우유가 바나나이고
                        dp[i][j][1] > dp[i][j][2]) // 이전에 초코를 마셨다면
                {   // 이전까지 마신 우유 + 1
                    dp[i][j][2] = Math.max(dp[i][j-1][1] + 1, dp[i-1][j][1] + 1);
                } else {    // 그게 아니면 이전에 딸기를 먹었을 때 합을 유지한다.
                    dp[i][j][2] = Math.max(dp[i][j-1][2], dp[i-1][j][2]);
                }
            }
        }

        maxCount = Math.max(dp[n][n][0], Math.max(dp[n][n][1], dp[n][n][2]) );
        System.out.println(maxCount);
    }
}
