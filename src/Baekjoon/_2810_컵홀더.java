package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2810_컵홀더 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        int starCnt = 0;
        for(int i = 0; i < n; i++){
            if (str.charAt(i) == 'S'){
                sb.append('*').append('S');
                starCnt++;
            }
            else if(str.charAt(i) == 'L'){
                sb.append('*').append("LL");
                i++;
                starCnt++;
            }
        }
        sb.append('*');
        starCnt++;

        if(starCnt > n)
            System.out.println(n);
        else
            System.out.println(starCnt);
    }
}
