package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _10814_나이순_정렬 {
    public static void main(String[] args) throws IOException {
        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i ++){
            st = new StringTokenizer(br.readLine(), " ");

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new AbstractMap.SimpleEntry<>(name, age));
        }

        list.sort(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getValue() + " " + entry.getKey() );
        }
    }
}
