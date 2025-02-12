package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _14916_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int coin5 = n / 5;
        int coin2 = 0;

        while(coin5 >= 0){
            if( (n - 5 * coin5) % 2 == 0 ){
                coin2 = (n - 5 * coin5) / 2;
                break;
            } else {
                coin5--;
            }
        }

        System.out.println(coin5 + coin2);
    }
}
