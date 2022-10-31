package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class _1427_소트인사이드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] tmpArr = str.split("");

        Arrays.sort(tmpArr, Comparator.reverseOrder());

        for(String tmp : tmpArr)
            System.out.print(tmp);
    }
}
