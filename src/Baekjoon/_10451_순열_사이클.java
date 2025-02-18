package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class _10451_순열_사이클 {
    private static boolean visited[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());

        int n = 0;
        int cnt = 0;
        for(int i = 0; i < t; i++){
            n = Integer.parseInt(br.readLine());
            int [] arr = new int [n+1];
            visited = new boolean[n+1];
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 1; j <= n; j++){
                arr[j] = Integer.parseInt(st.nextToken());
            }

            cnt = 0;
            for(int k = 1; k <= n; k++){
                if(visited[k] == false){
                    dfs(arr, k);
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static void dfs(int[] arr, int startIndex){
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[startIndex]);
        int currentNode = 0;
        while (!stack.isEmpty()){
            currentNode = stack.pop();

            if(visited[currentNode])
                continue;
            visited[currentNode] = true;
            stack.push(arr[currentNode]);
        }
    }
}