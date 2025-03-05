package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1431_시리얼_번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, Comparator.comparingInt(String::length)
                .thenComparing(s -> sumOfDigits(s))
                .thenComparing(Comparator.naturalOrder()));

        for(String ar : arr){
            System.out.println(ar);
        }
    }

    private static int sumOfDigits(String s){
        int sum = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += ch - '0';  // 문자를 숫자로 변환하여 더함
            }
        }
        return sum;
    }
}
