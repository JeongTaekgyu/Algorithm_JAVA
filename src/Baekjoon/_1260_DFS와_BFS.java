package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1260_DFS와_BFS {
    // ★★★ DFS와 BFS에서 방문 표시 개념이 다르니까 주의하자 ★★★
    static int map[][];
    static boolean[] visited;  // 방문 여부를 검사할 배열
    static int n, m, v;

    public static void dfs(int v){
        visited[v] = true;
        System.out.print(v+" ");

        for(int i = 1; i < n+1; i++){
            if(visited[i] == false && map[v][i] == 1){  // 방문하지 않았고 연결돼있는 정점이면
                dfs(i); // 방문한다.
            }
        }
    }

    public static void bfs(int v){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(v);
        visited[v] = false; // DFS에서 방문한 곳을 true 체크했기 때문에 반대로 체크하자

        while (!queue.isEmpty()){
            int cur_vertex = queue.poll();
            System.out.print(cur_vertex+" ");

            for(int i = 1; i <= n; i++){
                // bfs는 방문한곳을 false로 체크했기 때문에 여기선 visited[i] == true 로 체크하자
                if(map[cur_vertex][i] == 1 && visited[i] == true){
                    queue.offer(i);
                    visited[i] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 정점의 개수
        m = sc.nextInt();   // 간선의 개수
        v = sc.nextInt();   // 시작할 정점의 번호

        map = new int[n+1][n+1];
        visited = new boolean[n + 1]; // 방문 여부를 검사할 배열

        for(int i = 0; i < m; i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();

            map[v1][v2] = 1;
            map[v2][v1] = 1;
        }

        dfs(v);
        System.out.println();
        bfs(v);
    }
}
