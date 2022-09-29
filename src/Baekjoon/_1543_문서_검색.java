package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _1543_문서_검색 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        String document = br.readLine();
        String search = br.readLine();
        int cnt = 0;

        // 방법1
        document = document.replaceAll(search,"1");

        for(int i = 0; i < document.length(); i++){
            if(document.charAt(i) == '1')
                cnt++;
        }

        // 방법2
        /*int documentSize = document.length();
        int searchSize = search.length();

        document = document.replaceAll(search, "");
        cnt = ((documentSize - document.length()) / searchSize);
         */

        // 시간 초과 버전
        /*int ind = 0;
        for(int i = 0; i <= document.length() - search.length(); i= search.length()+ind ){
            ind = document.indexOf(search, i);
            if(ind != -1)
                cnt++;
//            System.out.println("있어? : "+ ind);
            if(i == 0)
                i += ind;
        }*/

        System.out.println(cnt);
    }
}
