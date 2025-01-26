package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2805_나무_자르기_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int [] treeArray = new int[n];
        int max = 0;
        for(int i = 0; i < n; i++){
            treeArray[i] = Integer.parseInt(st.nextToken());
            if(treeArray[i] > max)
                max = treeArray[i];
        }

        int min = 1;
        int mid;
        long sum;
        while(min <= max){
            sum = 0;
            mid = (min + max) / 2;
            for(int i = 0; i < n; i++) {
                if (treeArray[i] - mid > 0) {
                    sum += treeArray[i] - mid;
                }
            }
            if(sum >= m){
                min = mid + 1;
            } else if(sum < m){
                max = mid - 1;
            }
        }

        System.out.println(max);
    }
}
