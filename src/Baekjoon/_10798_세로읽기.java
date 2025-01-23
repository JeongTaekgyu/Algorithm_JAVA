package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10798_세로읽기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[5][15];

        int maxlength = 0;
        for(int i = 0; i < 5; i++){
            String line = br.readLine();
            if(maxlength < line.length())
                maxlength = line.length();
            for(int j = 0; j < line.length(); j++){
                arr[i][j] = line.charAt(j);
            }
        }

        for(int j = 0; j < maxlength; j++ ){
            for(int i = 0; i < 5; i++){
                if(arr[i][j] != '\0')
                    System.out.print(arr[i][j]);
            }
        }
    }
}
