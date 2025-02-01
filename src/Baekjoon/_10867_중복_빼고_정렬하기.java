package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Set;
import java.util.StringTokenizer;
//import java.util.TreeSet;

public class _10867_중복_빼고_정렬하기 {
    public static void main(String[] args) throws IOException {
        // 방법1. 계수 정렬
        // 시간 복잡도 O(N + M), O(삽입 + 출력)
        // // N = 입력 데이터 개수, M = 가능한 정수 범위 크기 -1000 ~ 1000
        // 공간 복잡도 O(M)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] cnt = new int[2001];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i = 0; i < n; i++){
            cnt[Integer.parseInt(st.nextToken()) + 1000]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 2001; i++){
            if(cnt[i] > 0){
                sb.append((i-1000)+" ");
            }
        }

        System.out.println(sb);

        // 방법2. Set 정렬 (TreeSet은 자동 정렬)
        // 시간 복잡도 삽입 : O(N logN) (이진 탐색 트리연산), 출력 O(N)
        // 공간 복잡도 O(N)
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder sb = new StringBuilder();
        for (int num : set) {
            sb.append(num).append(" ");
        }
        System.out.println(sb);*/
    }
}
