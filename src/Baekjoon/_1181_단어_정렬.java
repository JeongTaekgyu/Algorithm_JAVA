package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class _1181_단어_정렬 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] strr = new String[n];


        for(int i = 0; i < n; i++){
            strr[i] = br.readLine();
        }

        Arrays.sort(strr);

        // 정렬 메서드가 정렬 기준으로 Comparator의 compare를 사용해서 a1과 a2를 비교할 때
        // 그 비교값이 음수이면 순서를 그대로 놔두고 양수가 나오면 str1과 str2의 순서를 바꿔준다
        Arrays.sort(strr, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();   // 단어의 길이는 50이하 이므로 underflow나 overflow가 발생하지 않는다.
            }
        });

        // 중복 제거
        strr = Arrays.stream(strr).distinct().toArray(String[]::new);

        for(String tmp : strr){
            bw.write(tmp + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
