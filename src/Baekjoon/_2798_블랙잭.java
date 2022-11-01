package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798_블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(result(arr, N, M));
    }

    public static int result(int[] arr, int N, int M){
        int result = 0;

        for(int i = 0; i < N-2; i++){
            if(arr[i] > M)
                continue;
            for(int j = i+1; j < N-1; j++){
                if(arr[i] + arr[j] > M)
                    continue;
                for(int k = j+1; k < N; k++){
                    int tmp = arr[i] + arr[j] + arr[k];

                    if(M == tmp)
                        return tmp;
                    if(result < tmp && tmp < M){
                        result = tmp;
                    }
                }
            }
        }

        return result;
    }
}