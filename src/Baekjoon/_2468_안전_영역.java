package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _2468_안전_영역 {

    static int[] dirX = {0, 1, 0, -1};
    static int[] dirY = {-1, 0, 1, 0};
    static List<Integer> list = new ArrayList<>();
    static int[][] maps;
    static boolean visit[][];
    static int n, nowX, nowY;

    public static void dfs(int a, int b, int num){
        visit[a][b] = true;

        for(int i = 0; i < 4; i++){
            nowX = a + dirX[i]; // 이게 행이기 때문에 y축이 맞긴함 그래서 nowY, dirY로 쓰는게 더 맞는 말이긴함
            nowY = b + dirY[i]; // 이게 열이기 때문에 x축이 맞긴함 그래서 nowX, dirX로 쓰는게 더 맞는 말이긴함

            if(nowX >=0 && nowY >= 0 && nowX < n && nowY < n
                && visit[nowX][nowY] == false
                && maps[nowX][nowY] >= num)
            {
                dfs(nowX, nowY, num);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        maps = new int[n][n];
        StringTokenizer st;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                maps[i][j] = Integer.parseInt(st.nextToken());
                if( !list.contains(maps[i][j]))
                    list.add(maps[i][j]);
            }
        }

        int safeArea;
        int max = 0;
        // 3중 for문이다
        for(int num: list){
            visit = new boolean[n][n];
            safeArea = 0;

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    if( !visit[i][j] && maps[i][j] >= num){
                        dfs(i, j, num);
                        safeArea++;
                    }
                }
            }
            max = Math.max(max, safeArea);
        }
        
        System.out.println(max);
    }
}
