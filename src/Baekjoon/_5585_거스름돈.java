package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _5585_거스름돈 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] coins = new int[] {500, 100, 50, 10, 5 ,1};
        int change = 1000 - n;
        int i = 0;
        int coinCnt = 0;

        while (change > 0){
            coinCnt += change / coins[i];
            change = change % coins[i];
            i++;
        }

        System.out.println(coinCnt);
    }
}
