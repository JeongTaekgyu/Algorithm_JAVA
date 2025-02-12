package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2839_설탕_배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bag5 = n / 5;
        int bag3 = 0;

        while(bag5 >= 0) {
            if( (n - 5*bag5) % 3 == 0 ){
                bag3 = (n - 5*bag5) / 3;
                break;
            }
            bag5--;
        }

        if(bag5 == -1)
            System.out.println(-1);
        else
            System.out.println(bag5 + bag3);
    }
}
