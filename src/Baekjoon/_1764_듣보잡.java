package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1764_듣보잡 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for(int i = 0; i < N; i++){
            set1.add(br.readLine());
        }
        for(int i = 0; i < M; i++){
            set2.add(br.readLine());
        }

        HashSet<String> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        List list = new ArrayList(intersectionSet);
        Collections.sort(list);

        System.out.println(list.size());
        for(Object str : list){
            System.out.println(str);
        }

    }
}
