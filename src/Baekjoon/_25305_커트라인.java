package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _25305_커트라인 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] scores = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores);

        System.out.println(scores[scores.length-k]);
    }
}
