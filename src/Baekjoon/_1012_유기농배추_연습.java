package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1012_유기농배추_연습 {

    static int m; // 가로길이(1~50)
    static int n; // 세로길이(1~50)
    static int k; // 배추가 심어져있는 위치의 갯수(1~2500)
    static int[][] maps; // 배추 지도
    static boolean[][] visited;
    static int result; // 최소 벌레 수

    // 서 남 동 북
    static int[] dirRow = {0, 1, 0, -1}; // 행
    static int[] dirCol = {-1, 0, 1, 0}; // 열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int answer = 0;

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());   // 가로
            n = Integer.parseInt(st.nextToken());   // 세로
            k = Integer.parseInt(st.nextToken());   // 지렁이 수

            maps = new int[n][m];
            visited = new boolean[n][m];

            for(int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                maps[b][a] = 1;
            }

            answer = 0;
            for (int row = 0; row < n; row++){
                for(int col = 0; col < m; col++){
                    // 지렁이가 있고 방문하지 않은 곳이면 dfs 탐색한다.
                    if(maps[row][col] == 1 && !visited[row][col]){
                        dfs(row, col);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }

    public static void dfs(int r, int c){
        visited[r][c] = true;
        int dr, dc;

        for(int i = 0; i < 4; i++){
            dr = r + dirRow[i];
            dc = c + dirCol[i];
            // 배추밭 범위 안에 있고 지렁이가 있고 방문하지 않은 곳이면 dfs탐색한다.
            if( dr >= 0 && dc >= 0 && dr < n && dc < m
                && maps[dr][dc] == 1
                && !visited[dr][dc])
            {
                dfs(dr, dc);
            }
        }
    }
}
