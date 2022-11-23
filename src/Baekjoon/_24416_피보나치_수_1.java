package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _24416_피보나치_수_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(dp_fibo(N)+" "+ (N-2));
    }

    public static int recursive_fibo(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else {
            return recursive_fibo(n-1) + recursive_fibo(n-2);
        }
    }

    public static int dp_fibo(int n){
        int f1 = 0, f2 = 1, f3 = 1;

        for(int i = 2; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        return f3;
        // 배열 사용
        /*int[] fibo = new int[n+1];
        fibo[1] = fibo[2] = 1;
        for(int i = 3; i <= n; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        return fibo[n];*/
    }
}
