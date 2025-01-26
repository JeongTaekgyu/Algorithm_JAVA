package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _27433_팩토리_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        System.out.println(fac(n));
    }

    public static long fac(long n){
        if(n == 0 || n == 1)
            return 1;
        return n * fac(n-1);
    }
}
