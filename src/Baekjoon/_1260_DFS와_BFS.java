package Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class _1260_DFS와_BFS {
    // ★★★ DFS와 BFS에서 방문 표시 개념이 다르니까 주의하자 ★★★
    // (dfs는 정상 체크이지만 bfs는 dfs가 boolean visited 체크 했기 때문에 역으로 체크 해야한다.)
    static int map[][];
    static boolean[] visited;  // 방문 여부를 검사할 배열
    static int n, m, v;

    public static void dfs_stack(int v){
        Stack<Integer> stack = new Stack<Integer>();
        int len = map.length-1;
        stack.push(v);
        visited[v] = true;
        System.out.print(v + " ");

        boolean adjFlag = true;
        while (!stack.isEmpty()){
            int curNode = stack.peek();
            adjFlag = false;

            for(int i = 1; i <= len; i++){
                if(map[curNode][i] == 1 && !visited[i]){
                    stack.push(i);
                    System.out.print(i + " ");
                    visited[i] = true;
                    adjFlag = true;

                    break; // 이게 반복문 밖으로 나가게 해줘서 중요하네
                }
            }

            if(!adjFlag) { // 인접하지 않으면 pop 해버리네
                stack.pop();
            }
        }
    }

    public static void dfs_recur(int v){
        visited[v] = true;
        System.out.print(v+" ");

        for(int i = 1; i < n+1; i++){
            if(visited[i] == false && map[v][i] == 1){  // 방문하지 않았고 연결돼있는 정점이면
                dfs_recur(i); // 방문한다.
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
                    visited[i] = false; // 방문함을 표시 (반대로)
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

//        dfs_recur(v);
        dfs_stack(v);
        System.out.println();
        bfs(v);
    }
}
