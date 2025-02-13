package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2442_별_찍기_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2*n - 1; j++){
                if(j >= n-1-i && j < n+i)
                    sb.append('*');
                else if(j < n-1-i)
                    sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
