package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class _11650_좌표_정렬하기_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> points = new ArrayList<>();
        for(int i =0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points.add(new int[]{x,y});
        }
        br.close();

        Collections.sort(points, (p1, p2) -> {
            if (p1[0] == p2[0]) {
                return Integer.compare(p1[1], p2[1]); // x좌표가 같다면 y좌표 오름차순
            } else {
                return Integer.compare(p1[0], p2[0]); // x좌표 기준 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int [] point: points){
            sb.append(point[0]).append(" ").append(point[1]).append("\n");
        }
        System.out.println(sb);
    }
}
