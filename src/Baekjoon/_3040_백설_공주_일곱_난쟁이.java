package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3040_백설_공주_일곱_난쟁이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[9];
        int sum = 0;

        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int excludeIdx1 = -1;
        int excludeIdx2 = -1;
        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){
                if( 100 == (sum - arr[i] - arr[j]) ){
                    excludeIdx1 = i;
                    excludeIdx2 = j;
                }
            }
        }

        for(int i = 0; i < 9; i++){
            if(i != excludeIdx1 && i != excludeIdx2) {
                System.out.println(arr[i]);
            }
        }
    }
}
