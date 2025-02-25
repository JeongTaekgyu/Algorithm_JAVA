package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1789_수들의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        long sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            if(sum > n){
                System.out.println(i-1);
                break;
            }
            else if(sum == n){
                System.out.println(i);
                break;
            }
        }
    }
}
