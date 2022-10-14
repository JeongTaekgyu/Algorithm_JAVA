package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _11724_연결_요소의_개수 {

    public static void dfs(boolean[] visited, int v, int[][] maps){
        int leng = maps.length;
        visited[v] = true;

        for(int i = 1; i < leng; i++){
            if(maps[v][i] == 1 && !visited[i]){
                dfs(visited, i, maps);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] maps = new int[n + 1][n + 1];
        boolean visited[] = new boolean[n+1];
        int a, b;
        int answer = 0;

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            maps[a][b] = maps[b][a] = 1;
        }

        for(int i = 1; i <= n; i++ ){
            if(!visited[i]){
                dfs(visited, i ,maps);
                answer++;
            }
        }

        System.out.println(answer);
    }
}
