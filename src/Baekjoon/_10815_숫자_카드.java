package Baekjoon;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class _10815_숫자_카드 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M;
        HashSet<Integer> set = new HashSet<>();
        int num;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            num = Integer.parseInt(st.nextToken());
            if(set.contains(num))
                bw.write("1 ");
            else
                bw.write("0 ");
        }

        bw.flush();
        bw.close();
    }
}
