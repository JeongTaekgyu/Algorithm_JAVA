package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class _2805_나무_자르기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 나무의 수
        int m = sc.nextInt();   // 가져가려고 하는 나무의 길이
        int[] woods = new int[n];
        int start, end, mid;
        long cuttedWoods = 0;
        int max = 0;

        for(int i = 0; i < n; i++){
            woods[i] = sc.nextInt();
            if(max < woods[i])
                max = woods[i];
        }

        start = 1;
        end = max;

        while (start <= end) {
            cuttedWoods = 0;
            mid = (start + end)/2;

            for(int i = 0; i < n; i++){
                if(woods[i] > mid)
                    cuttedWoods += woods[i] - mid;
            }

            if(m <= cuttedWoods)
                start = mid + 1;
            else
                end = mid - 1;
        }

        System.out.print(end);
    }
}
