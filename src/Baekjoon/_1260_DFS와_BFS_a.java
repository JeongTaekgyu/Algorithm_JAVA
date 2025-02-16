package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class _1260_DFS와_BFS_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int [][] graph = new int[n+1][n+1];
        int v1 = 0;
        int v2 = 0;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            v1 = Integer.parseInt(st.nextToken());
            v2 = Integer.parseInt(st.nextToken());
            graph[v1][v2] = 1;
            graph[v2][v1] = 1;
        }

        dfs(graph, v, n);
        System.out.println();
        bfs(graph, v, n);
    }

    public static void dfs(int[][] graph, int startNode, int size){
        Stack<Integer> stack = new Stack<>();
        boolean [] visited = new boolean[size+1];

        stack.push(startNode);

        int currentNode = 0;
        while (!stack.isEmpty()){
            currentNode = stack.pop();
            if(visited[currentNode]) {
                continue;
            }
            System.out.print(currentNode+" ");
            visited[currentNode] = true;

            for(int i = size; i > 0; i--){
                if(visited[i] == false && graph[currentNode][i] == 1){
                    stack.push(i);
                }
            }
        }
    }

    public static void bfs(int[][] graph, int startNode, int size){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[size+1];

        queue.add(startNode);
        int currentNode = 0;
        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            if(visited[currentNode]) {
                continue;
            }
            System.out.print(currentNode+" ");
            visited[currentNode] = true;

            for(int i = 1; i <= size; i++){
                if(visited[i] == false && graph[currentNode][i] == 1){
                    queue.add(i);
                }
            }
        }
    }
}
