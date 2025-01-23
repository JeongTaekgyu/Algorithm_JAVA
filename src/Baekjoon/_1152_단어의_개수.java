package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _1152_단어의_개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().trim();

        String[] words = str.split(" ");
        if(words[0].equals("")){
            System.out.println(words.length - 1);
        } else {
            System.out.println(words.length);
        }
    }
}
