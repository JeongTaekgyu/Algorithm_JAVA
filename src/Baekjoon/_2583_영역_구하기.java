package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2583_영역_구하기 {
    static int[] da = {0, 1, 0, -1};
    static int[] db = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int [][] graph = new int[m][n];
        boolean [][] visited = new boolean[m][n];
        int [][] point = new int[k][4];

        for(int i = 0; i < k; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 4; j++){
                point[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < k; i++){
            for(int j = point[i][1]; j < point[i][3]; j++){
                for(int t = point[i][0]; t < point[i][2]; t++){
                    graph[j][t] = 1;
                    visited[j][t] = true;
                }
            }
        }

        List<Integer> answer = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(visited[i][j] == false && graph[i][j] == 0){
                    answer.add(bfs(graph, visited, i, j));
                    idx++;
                }
            }
        }

        Collections.sort(answer);
        System.out.println(idx);
        for(int ans : answer)
            System.out.print(ans + " ");
    }

    public static int bfs(int [][] graph, boolean [][] visited, int ia, int ib){
        // 방문한 노드를 카운트해서 cnt를 반환하자
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {ia,ib});

        int cnt = 0;
        while (!queue.isEmpty()){
            int[] now = queue.poll();
            int a = now[0];
            int b = now[1];
            if(visited[a][b])
                continue;
            visited[a][b] = true;
            cnt++;

            for(int i = 0; i < 4; i++){
                int na = a + da[i];
                int nb = b + db[i];

                if( na >= 0 && na < graph.length && nb >= 0 && nb < graph[0].length
                        && visited[na][nb] == false && graph[na][nb] == 0) {

                    queue.add(new int[]{na, nb});
                }
            }
        }

        return cnt;
    }
}
