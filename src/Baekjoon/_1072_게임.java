package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1072_게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());
        long currentWinRate = (y * 100)/ x;
        long targetWinRate = currentWinRate + 1;

        if(currentWinRate == 100 || currentWinRate == 99){
            System.out.println(-1);
            return;
        }

        long low = 1;
        long high = x;
        long mid;
        while (low < high){
            mid = (low + high)/2;
            currentWinRate = ( (y + mid)*100 / (x + mid) );

            if(currentWinRate >= targetWinRate){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(high);
    }
}
