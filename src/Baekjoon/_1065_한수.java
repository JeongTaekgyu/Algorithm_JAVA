package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1065_한수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 99;

        if(n <= 110 && n > 99){
            System.out.println(99);
        }
        else if(n <= 99){
            System.out.println(n);
        }
        else {
            int hun = 0;
            int ten = 0;
            int one = 0;
            for(int i = 111; i <= n; i++){
                one = i % 10;
                ten = (i / 10) % 10;
                hun = i / 100;
                if((one - ten) == (ten - hun)){
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}
