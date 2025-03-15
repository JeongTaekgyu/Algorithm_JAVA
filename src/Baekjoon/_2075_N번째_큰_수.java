package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class _2075_N번째_큰_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] arr = new int[n][n];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        StringTokenizer st;

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(minHeap.size() < n){
                    minHeap.add(arr[i][j]);
                }
                else if(minHeap.size() == n && minHeap.peek() < arr[i][j]){
                    minHeap.add(arr[i][j]);
                    minHeap.poll();
                }
            }
        }

        System.out.println(minHeap.peek());
    }
}
