package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2512_예산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int totalAsset;
        int max = 0;
        int min = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i])
                max = arr[i];
        }

        totalAsset = Integer.parseInt(br.readLine());

        int mid = 0;
        int sum = 0;
        while (min <= max){
            mid = (min + max) / 2;
            sum = 0;
            for(int i = 0; i < n; i++){
                if(arr[i] <= mid){
                    sum += arr[i];
                } else {
                    sum += mid;
                }
            }

            if(sum > totalAsset){
                max = mid -1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(max);
    }
}
