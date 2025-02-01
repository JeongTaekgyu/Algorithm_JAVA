package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10989_수_정렬하기_3_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] cnt = new int[10001];

        // 계수 정렬 사용
        for(int i = 0; i < n; i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < 10001; i++){
            while (cnt[i] > 0){
                sb.append(i+"\n");
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
