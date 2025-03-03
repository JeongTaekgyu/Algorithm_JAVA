package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _2644_촌수계산 {
    static int [] distance;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] graph = new int[n+1][n+1];
        int startNode, endNode, m;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        startNode = Integer.parseInt(st.nextToken());
        endNode = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(br.readLine());

        int x, y;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        bfs(graph, startNode, endNode, n);

        if(distance[endNode] == 0)
            System.out.println(-1);
        else
            System.out.println(distance[endNode]);
    }

    public static void bfs(int [][] graph, int startNode, int endNode, int size) {
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[size+1];
        distance = new int[size+1];

        queue.add(startNode);
        int currentNode = 0;
        while (!queue.isEmpty()){
            currentNode = queue.poll();
            if(currentNode == endNode){
                break;
            }
            if(visited[currentNode]){
                continue;
            }
            visited[currentNode] = true;

            for(int i = 1; i <= size; i++){
                if(visited[i] == false && graph[currentNode][i] == 1){
                    queue.add(i);
                    distance[i] = distance[currentNode] + 1;
                }
            }
        }
    }
}
