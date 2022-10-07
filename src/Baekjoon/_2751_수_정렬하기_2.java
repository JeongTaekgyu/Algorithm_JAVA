package Baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class _2751_수_정렬하기_2 {

    public static void main(String[] args) throws IOException {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            pq.add(m);
        }

        for(int i = 0; i < n; i++){
             bw.write(String.valueOf(pq.poll()) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
