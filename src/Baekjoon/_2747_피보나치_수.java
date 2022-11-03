package Baekjoon;

import java.io.*;

public class _2747_피보나치_수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int f1 = 0, f2 = 1, f3 = 1;

        for(int i = 2; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        bw.write(f3+"\n");

        bw.flush();
        bw.close();
    }
}
