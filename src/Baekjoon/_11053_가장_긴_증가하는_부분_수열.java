package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11053_가장_긴_증가하는_부분_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int [] dp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = 1;
        }

        int maxDp = 0;
        for(int i = 1; i < n; i++){
            maxDp = 0;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i] && maxDp < dp[j]){
                    maxDp = dp[j];
                }
            }
            dp[i] = maxDp + 1;
        }

        maxDp = 0;
        for(int i = 0; i < n; i++){
            if(dp[i] > maxDp)
                maxDp = dp[i];
        }
        System.out.println(maxDp);

    }
}
