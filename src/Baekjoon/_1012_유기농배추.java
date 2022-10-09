package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1012_유기농배추 {

    static int m; // 가로길이(1~50)
    static int n; // 세로길이(1~50)
    static int k; // 배추가 심어져있는 위치의 갯수(1~2500)
    static int[][] maps; // 배추 지도
    static boolean[][] visited;
    static int result; // 최소 벌레 수

    // 북 동 남 서
    static int[] dx = {0, 1, 0, -1}; // 가로
    static int[] dy = {-1, 0, 1, 0}; // 세로

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int t = Integer.parseInt(str);

        for(int i=0; i<t; i++) {
            str = br.readLine();
            m = Integer.parseInt(str.split(" ")[0]);
            n = Integer.parseInt(str.split(" ")[1]);
            k = Integer.parseInt(str.split(" ")[2]);

            maps = new int[n][m];
            visited = new boolean[n][m];
            result = 0;

            // 배추 심어져있는 갯수
            int x; // 가로
            int y; // 세로
            for(int j = 0; j < k; j++) {
                str = br.readLine();
                x = Integer.parseInt(str.split(" ")[0]);
                y = Integer.parseInt(str.split(" ")[1]);
                // 지도에 넣어주기
                maps[y][x] = 1;
            }

            // 지렁이 둘 구간 탐색
            for(int a = 0; a < n; a++) {
                for(int b = 0; b < m; b++) {
                    //System.out.print(maps[a][b]);
                    if(maps[a][b]==1 && !visited[a][b]) {
                        result++;
                        visited[a][b] = true;
                        dfs(a, b);
                    }
                }
            }
            //결과값 출력
            System.out.println(result);
        }
    }

    // 행이 y니까 a:행, b:열 이니까 dfs(a, b)로 들어가면  dfs(y, x)로 받는게 맞네
    static void dfs(int y, int x) { // 애초에 y, x 로 들어오네
        int nx, ny;

        for(int i=0; i<4; i++) {
            ny = y + dy[i];
            nx = x + dx[i];

            // 범위 체크
            if(ny>=0 && nx>=0 && ny<n && nx<m) {
                // 배추가 있고 방문 안한 곳
                if(maps[ny][nx] == 1 && !visited[ny][nx]) {
                    visited[ny][nx] = true;
                    dfs(ny, nx);
                }
            }
        }
    }

}
