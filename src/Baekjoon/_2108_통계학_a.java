package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2108_통계학_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] indexArr = new int[8001];
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int sum = 0;
        int max = 0;
        int chk = 0;
        int maxFrequencyValue = 0;

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            indexArr[arr[i] + 4000]++;
        }
        Arrays.sort(arr);

        for(int i = 0; i < 8001; i++){
            if(max < indexArr[i]){
                max = indexArr[i];
            }
        }
        // 위에 8001번 순환 한거보다 아래 로직이 시간이 더걸린다 아무래도 연산이 들어가서 그런것 같다
        /*for(int i = 0; i < n; i++){
            indexArr[arr[i] + 4000]++;
            if(max < indexArr[arr[i] + 4000]){
                max = indexArr[arr[i] + 4000];
            }
        }*/

        for(int i = 0; i < 8001; i++){
            if(max == indexArr[i]){
                chk++;
                maxFrequencyValue = i - 4000;
            }
            if(chk == 2){
                break;
            }
        }

        // 산술평균
        System.out.println(Math.round((double) sum/n));
        // 중앙값
        System.out.println(arr[(arr.length-1)/2]);
        // 최빈값
        System.out.println(maxFrequencyValue);
        // 범위
        System.out.println(arr[arr.length-1] - arr[0]);

    }
}
