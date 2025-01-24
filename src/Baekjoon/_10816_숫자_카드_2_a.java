package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _10816_숫자_카드_2_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Map<Integer, Integer> map = new HashMap<>();

        int num;
        for(int i = 0; i < n; i++){
            num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int m = Integer.parseInt(br.readLine());
        int []arr = new int[m];
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < m; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(map.get(arr[i]) != null){
                sb.append(map.get(arr[i])).append(" ");
            }
            else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString());
    }
}
