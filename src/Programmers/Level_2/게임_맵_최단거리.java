package Programmers.Level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 게임_맵_최단거리 {
    /*
    경로의 특징을 저장해둬야 하는 문제
    예를 들면 각 정점에 숫자가 적혀있고 a부터 b까지 가는 경로를 구하는데 경로에 같은 숫자가 있으면 안 된다는 문제 등,
    각각의 경로마다 특징을 저장해둬야 할 때는 DFS를 사용한다. (BFS는 경로의 특징을 가지지 못함)
    
    최단거리 구해야 하는 문제
    미로 찾기 등 최단거리를 구해야 할 경우, BFS가 유리하다.
    왜냐하면 깊이 우선 탐색으로 경로를 검색할 경우 처음으로 발견되는 해답이 최단거리가 아닐 수 있지만,
    너비 우선 탐색으로 현재 노드에서 가까운 곳부터 찾기 때문에경로를 탐색 시 먼저 찾아지는 해답이 곧 최단거리기 때문이다.
     */
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {-1, 1, 0, 0};

    public static int solution(int[][] maps) {
        int answer = 0;
        int[][] visited = new int[maps.length][maps[0].length];

        visited[0][0] = 1; // 시작 위치 방문체크

        // bfs 탐색
        bfs(maps, visited);
        // 도착지 값을 넣어주기
        answer = visited[maps.length - 1][maps[0].length - 1];

        // 갈 수 없다면 -1리턴
        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }

    public static void bfs(int[][] maps, int[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];

            // 4방탐색
            for (int i = 0; i < 4; i++) {
                // 이동했을 때 위치
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 범위 벗어나는지 체크
                // 방문했는지 체크
                // 갈 수 있는지 체크
                if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length
                        && visited[nx][ny] == 0 && maps[nx][ny] == 1) {
                    // 방문했다고 체크해주기
                    visited[nx][ny] = visited[x][y] + 1;
                    // 큐에 넣기
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1},
                {0,0,0,0,1}
        };

        System.out.println(solution(maps));
    }
}
