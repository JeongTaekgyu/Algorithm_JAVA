package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class _2606_바이러스 {

    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        int [][] arr = new int[n+1][n+1];
        visited = new boolean[n+1];

        StringTokenizer st;
        int v1;
        int v2;
        for(int i = 0; i < e; i++){
            st = new StringTokenizer(br.readLine(), " ");
            v1 = Integer.parseInt(st.nextToken());
            v2 = Integer.parseInt(st.nextToken());
            arr[v1][v2] = 1;
            arr[v2][v1] = 1;
        }

        int cnt = dfs(arr, n , 1);
//        int cnt = bfs(arr, n , 1); // 둘이 시간 똑같음

        System.out.println(cnt);
    }

    public static int bfs(int[][] arr, int size, int startNode){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        int cnt = -1;

        int currentNode = 0;
        while (!queue.isEmpty()){
            currentNode = queue.poll();
            if(visited[currentNode])
                continue;
            visited[currentNode] = true;
            cnt++;

            for(int i = 1; i <= size; i++){
                if(visited[i] == false && arr[currentNode][i] == 1){
                    queue.add(i);
                }
            }
        }

        return cnt;
    }

    public static int dfs(int[][] arr, int size, int startNode){
        Stack<Integer> stack = new Stack();
        stack.push(startNode);
        int cnt = -1;

        int currentNode = 0;
        while (!stack.isEmpty()){
            currentNode = stack.pop();
            if(visited[currentNode])
                continue;
            visited[currentNode] = true;
            cnt++;

            for(int i = size; i >= 1; i--){
                if(visited[i] == false && arr[currentNode][i] == 1){
                    stack.push(i);
                }
            }
        }

        return cnt;
    }
}
