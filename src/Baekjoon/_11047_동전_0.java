package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class _11047_동전_0 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자열을 지정한 구분자로 문자열을 쪼개주는 클래스
        // new StringTokenizer()사용시 디폴트로 공백과 엔터로 문자열을 쪼갠다.
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken()); // 동전의 개수
        int k = Integer.parseInt(st.nextToken()); // 필요한 돈

        int[] coin = new int[n];

        for(int i = 0; i < n; i++ ){
            coin[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;
        for(int i = n-1; i >=0; i--){
            if( k >= coin[i] ) {
                sum += (k / coin[i]);
                k = (k % coin[i]);
            }
        }
        // bw.write()를 통해 출력한다. cf) System.out.print()보다 빠르다.
        // 정수인 count를 String.valueOf()로 문자열로 변환한다.
        bw.write(String.valueOf(sum));

        // 사용한 br과 bw를 닫아준다.
        br.close();
        bw.close();
    }
}
