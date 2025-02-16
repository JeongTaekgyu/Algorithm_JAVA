package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _2667_단지번호붙이기 {
    // 주의점은 좌표가 x,y라고 적었는데 i,j로 봐야 한다
    // 정확히는 x랑 y좌표가 바뀌었다. 0,4 는 i,j로 0행 4열이다. 이건 원래 의미라면 x좌표 4 y 좌표 0 이지만
    // 이건 x,y좌표 개념으로 보면 안된다.
    private static int dx[] = {0, 0, 1, -1};
    private static int dy[] = {1, -1, 0, 0};
    private static int n = 0;
    private static int [][] graph = new int[25][25];
    private static boolean [][] visited = new boolean[25][25];
    private static int[] aparts = new int[25*25];
    private static int apartNum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];

        String inputLine;
        for(int i = 0; i < n; i++){
            inputLine = br.readLine();
            for(int j = 0; j < n; j++){
                graph[i][j] = inputLine.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(graph[i][j] == 1 && visited[i][j] == false){
                    apartNum++;
                    bfs(i, j);
                }
            }
        }

        Arrays.sort(aparts);
        System.out.println(apartNum);

        for(int i = 0; i < aparts.length; i++)
        {
            if(aparts[i] != 0)
                System.out.println(aparts[i]);
        }
    }

    public static void bfs( int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        aparts[apartNum]++;

        int [] peek;
        while (!queue.isEmpty()){
            peek = queue.peek();
            queue.poll();

            for(int i = 0; i < 4; i++){
                int nx = peek[0] + dx[i];
                int ny = peek[1] + dy[i];
                if(nx >= 0 && ny >= 0 && nx < n && ny < n){
                    if(graph[nx][ny] == 1 && visited[nx][ny] == false){
                        queue.add(new int[]{nx,ny});
                        visited[nx][ny] = true;
                        aparts[apartNum]++;
                    }
                }
            }
        }
    }

}
