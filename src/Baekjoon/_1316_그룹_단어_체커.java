package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class _1316_그룹_단어_체커 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean chk = true;

        String inputLine;
        char preChar = '0';
        int cnt = 0;
        for(int i = 0; i < n; i++){
            chk = true;
            inputLine = br.readLine();
            preChar = inputLine.charAt(0);

            Set<Character> set = new HashSet<>();
            set.add(inputLine.charAt(0));
            for(int j = 1; j < inputLine.length(); j++){
                if( inputLine.charAt(j) != preChar){
                    if( set.contains(inputLine.charAt(j)) ){
                        chk = false;
                        break;
                    } else{
                        set.add(inputLine.charAt(j));
                    }
                    preChar = inputLine.charAt(j);
                }
            }
            if(chk == true)
                cnt++;
        }

        System.out.println(cnt);
    }
}
