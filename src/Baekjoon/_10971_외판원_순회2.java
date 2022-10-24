package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10971_외판원_순회2 {

    static int[][] map;
    static boolean[] visited;
    static int n;
    static int answer = Integer.MAX_VALUE;

    public static void DFS (int start, int prev, int depth, int cost){
        if( depth == n){
            if(map[prev][start] > 0){
                answer = Math.min(answer, cost + map[prev][start]);
            }
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i] && map[prev][i] > 0) {
                visited[i] = true;
                DFS( start, i, depth + 1, cost + map[prev][i]);
                visited[i] = false; // 다른 경로도 가줘야하니까 방문 끝나면 false 표시한다.
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 1; i <= n; i++){
            if( !visited[i] ){
                visited[i] = true;
                DFS(i, i, 1, 0);
            }
        }

        System.out.println(answer);
    }
}
