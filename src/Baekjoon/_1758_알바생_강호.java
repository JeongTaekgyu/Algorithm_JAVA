package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class _1758_알바생_강호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        n = Integer.parseInt(br.readLine());
        Integer arr[] = new Integer[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // arr을 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        long sum = 0;
        for(int i = 0; i < n; i++){
            if( (arr[i] - (i+1 -1)) > 0){
                sum += arr[i] - (i+1 -1);
            }
        }
        System.out.println(sum);
    }
}
