package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2492_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int incLength = 1;
        int decLength = 1;
        int maxLength = 1;
        for(int i = 0; i < n-1; i++){
            if(arr[i] <= arr[i+1]){
                incLength++;
                maxLength = Math.max(maxLength, incLength);
            }
            if(arr[i] >= arr[i+1]){
                decLength++;
                maxLength = Math.max(maxLength, decLength);
            }
            if(arr[i] < arr[i+1]){
                decLength = 1;
            }
            if(arr[i] > arr[i+1]){
                incLength = 1;
            }
        }

        System.out.println(maxLength);
    }
}
