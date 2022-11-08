package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2231_분해합 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num;
        int sum = 0;
        int result = 0;

        for(int i = 1; i < N; i++){
            num = i;
            sum = 0;

            while (num > 0){
                sum += num % 10;
                num /= 10;
            }
            if(sum + i == N){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
