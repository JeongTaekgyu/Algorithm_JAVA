package Baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class _11650_좌표_정렬하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) // x좌표 같으면
                    return o1[1] - o2[1]; // y좌표로 판단해라 
                return o1[0] - o2[0]; // x좌표로 판단해라
            }
        });

        for(int i = 0; i < N; i++){
            bw.write(arr[i][0] + " " + arr[i][1]+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
