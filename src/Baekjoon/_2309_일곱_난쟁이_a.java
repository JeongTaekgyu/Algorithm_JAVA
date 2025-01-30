package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2309_일곱_난쟁이_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int sum = 0;
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);

        int twosum = 0;
        int flag = 0;
        int fir = 0;
        int sec = 0;
        for (int i = 0; i < 9; i++){
            for(int j = i+1; j < 9; j++){
                twosum = arr[i];
                if( i != j){
                    twosum += arr[j];
                }
                if((sum - twosum) == 100){
                    fir = i;
                    sec = j;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
                break;
        }

        for(int i = 0; i < 9; i++){
            if( i != fir && i != sec ){
                System.out.println(arr[i]);
            }
        }

    }
}
