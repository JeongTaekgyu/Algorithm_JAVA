package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798_블랙잭_Combination버전 {

    private static int m = 0;
    private static int delta = 0;

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 값 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        final int n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        delta = m;

        st = new StringTokenizer(br.readLine());
        final int[] num = new int[n];
        final boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        // 시작
        combination(num, visited, n, 0, 0);

        // 결과값 도출
        System.out.println(m - delta);
    }

    public static void combination(int[] num, boolean[] visited, int n, int r, int start) {
        if(r == 3) {
            // End Point 1. 3개를 모두 다 뽑은 경우
            int sum = 0;
            for(int i=0; i<num.length; i++) {
                if(visited[i]) {
                    sum += num[i];
                }
            }

            int temp = m - sum;
            if(temp >= 0  && temp < delta)
                delta = temp;
            return;
        }

        if(start >= n) {
            // End Point 2. 끝까지 모두 탐색한 경우
            return;
        }

        final int next = start + 1; // 그 다음 시작점

        // 뽑았다. (r을 증가)
        visited[start] = true;
        combination(num, visited, n, r + 1, next);

        // 안뽑았다. (r을 그대로 놔둠)
        visited[start] = false;
        combination(num, visited, n, r, next);
    }
}
