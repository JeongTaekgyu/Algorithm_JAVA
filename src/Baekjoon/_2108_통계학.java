package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _2108_통계학 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] indexArr = new int[8001]; // 음수 없애기 위해 4000*2 + 1 배열을 만듦
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int mode = 0; // 최빈값(가장 많이 나타나는 값)
        int index = 0;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        // 최빈값 구하기
        for(int i = 0; i < N; i++){
            index = 4000 + arr[i];
            indexArr[index]++; // count
            if(max < indexArr[index]){
                max = indexArr[index];
            }
        }

        int chk = 0;
        for(int i = 0; i < indexArr.length; i++){
            if(indexArr[i] == max){
                chk++;
                // indexArr[i] 가 나타난 횟수이므로
                // indexArr[3998] 이면 -2가 나타난 횟수이고 indexArr[4003] 이면 3이 나타난 횟수이다.
                mode = i - 4000; // 그러므로 최빈값은 i - 4000이다.
            }
            if(chk == 2){
                break;
            }
        }

        System.out.println(Math.round((double)sum/N));
        System.out.println(arr[N/2]);
        System.out.println(mode);
        System.out.println(arr[N-1] - arr[0]);
    }
}
