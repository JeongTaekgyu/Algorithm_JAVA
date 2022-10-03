package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2178_미로_탐색 {

    static int[] da = {0, 1, 0, -1};
    static int[] db = {-1, 0, 1, 0};

    public static int solution(int n, int m, int[][]maze) {
        int answer = 0;
        int[][] visited = new int[maze.length][maze[0].length];

        bfs(maze, visited);

        answer = visited[maze.length - 1][maze[0].length - 1] + 1;

        return answer;
    }

    public static void bfs(int[][] maze, int[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0,0});

        while (!queue.isEmpty()){
            int[] now = queue.poll();   // 현재 좌표 queue에서 빼기
            int a = now[0]; // 참고로 x,y 축이라고 생각하면 안되고 그냥 첫번째 좌표, 두번째 좌표라고 생각해야한다.
            int b = now[1];

            // 현재 좌표에서 좌우상하 이동할 곳 탐색
            for(int i = 0; i < 4; i++) {
                int na = a + da[i];
                int nb = b + db[i];

                if( na >= 0 && na < maze.length && nb >= 0 && nb < maze[0].length
                        && visited[na][nb] == 0 && maze[na][nb] == 1) {

                    visited[na][nb] = visited[a][b] + 1;
                    queue.add(new int[]{na, nb});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 세로 길이
        int m = Integer.parseInt(st.nextToken()); // 가로 길이

        int maze[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = str.charAt(j) - '0';
            }
        }

        System.out.println(solution(n, m, maze));
    }
}
