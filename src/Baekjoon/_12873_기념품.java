package Baekjoon;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class _12873_기념품 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            q.offer(i);

        long tmp = 0;
        for (int i = 1; i < n; i++, q.poll()) {
            tmp = ((long)i * i * i - 1);
            long num = tmp % q.size();
            while (num > 0){
                num--;
                q.offer(q.poll());
            }
        }

        bw.write(String.valueOf(q.poll()));
        bw.flush();
    }
}
