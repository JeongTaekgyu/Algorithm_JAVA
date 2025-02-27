package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1120_문자열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String stra = st.nextToken();
        String strb = st.nextToken();
        int cnt = 0;
        int maxCnt = 0;
        for(int i = 0; i <= strb.length() - stra.length(); i++){
            cnt = 0;
            for(int j = i; j < stra.length() + i; j++){
                if( stra.charAt(j-i) == strb.charAt(j) ){
                    cnt++;
                }
            }
            if(cnt > maxCnt){
                maxCnt = cnt;
            }
        }
        System.out.println(stra.length() - maxCnt);
    }
}
