package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2217_로프 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] ropes = new int[n];
        for(int i = 0; i < n; i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);
        int max = 0;
        for(int i = 0; i < n; i++){
            if( (ropes[i] * (n-i)) > max ){
                max = ropes[i] * (n-i);
            }
        }
        System.out.println(max);
    }
}
