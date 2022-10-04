package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1920_수_찾기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        // 문자열을 지정한 구분자로 문자열을 쪼개주는 클래스
        // new StringTokenizer()사용시 디폴트로 공백과 엔터로 문자열을 쪼갠다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start, end, mid;

        int m = Integer.parseInt(br.readLine());
        int[] brr = new int[m];

        st = new StringTokenizer(br.readLine());    // 다시 받는다.
        for (int i = 0; i < m; i++){
            brr[i] = Integer.parseInt(st.nextToken());
            start = 0;
            end = arr.length -1;
            mid = (start + end)/2;
            while (brr[i] != arr[mid]) {
                if(start >= end)
                    break;

                if(brr[i] < arr[mid])
                    end = mid - 1;
                else if(brr[i] > arr[mid])
                    start = mid + 1;

                mid = (start + end)/2;

            }
            if(brr[i] == arr[mid])
                System.out.println(1);
            else
                System.out.println(0);
        }
    }

}
