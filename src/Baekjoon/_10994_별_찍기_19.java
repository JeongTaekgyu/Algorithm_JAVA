package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10994_별_찍기_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char [][] stars = new char[4*n - 3][4*n - 3];
        for(int i =0; i < 4*n - 3; i++){
            for(int j = 0; j < 4*n - 3; j++){
                stars[i][j] = ' ';
            }
        }

        drawStart(0, stars, n);//재귀함수 호출

        for(int i = 0; i < 4*n -3; i++){
            for(int j = 0; j < 4*n -3; j++){
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }
    }

    public static void drawStart(int start, char[][] array, int n) {
        if (n <= 0) {//종료 조건
            return;
        }
        for (int i = start; i < start+4 * (n - 1) + 1; i++) {
            array[start][i] = '*';
            array[i][start] = '*';
            array[start+4 * (n - 1)][i] = '*';
            array[i][start+4 * (n - 1)] = '*';

        }
        drawStart(start+2, array, n-1);
    }
}
