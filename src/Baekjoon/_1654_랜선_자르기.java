package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1654_랜선_자르기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        long max = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max)
                max = arr[i];
        }
        max++;

        long min = 0;
        while (min < max){
            long mid = (min + max) / 2;
            int count = 0;
            for(int i = 0; i < N; i++){
                count += (arr[i] / mid);
            }
            if(count < M) {
                max = mid;
            } else{
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
