package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920_수_찾기_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[]arr1 = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        int[]arr2 = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        for(int num : arr2){
            int low = 0;
            int high = n-1;
            int mid = (low + high) / 2;

            while (num != arr1[mid]){
                if(low >= high)
                    break;

                if(num > arr1[mid]){
                    low = mid + 1;
                } else if(num < arr1[mid]){
                    high = mid - 1;
                }
                mid = (low + high)/2;
            }
            if(num == arr1[mid]){
                System.out.println(1);
            } else if(num != arr1[mid]){
                System.out.println(0);
            }
        }
    }
}
