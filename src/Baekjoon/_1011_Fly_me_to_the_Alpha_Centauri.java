package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1011_Fly_me_to_the_Alpha_Centauri {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*  1. max가 변하는 시점에 distance는 max의 제곱이 된다.
            2. max가 변하는 시점에 count는 max*2 - 1 이 된다.
            3. max가 변한 시점부터 count가 max개씩 분리되어 count가 같게 된다.
            max가 변한 시점인 9부터 다음으로 변하는 시점인 16까지의 사이에 있는 개수가 max*2개가 된다.
            3-1) max가 변한 시점이후로 max개는 count가 max*2가 되고,
            3-2) 그 이후로는 max개는 count가 max*2 + 1 이 된다.
         */
        for(int i = 0; i < n; i++ ){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            int distance = y - x;   // 거리
            int max = (int)Math.sqrt(distance); // 소수점 버림

            if(max == Math.sqrt(distance)) {    // 2. max가 변하는 시점은 max = 거리의 제곱근과 같다.
                System.out.println(max * 2 - 1);    // 그 때 count는 max*2 - 1 이 된다.
            }
            else if(distance <= max * max + max ) { // 3-1)  max * max < distance <= max( max + 1)
                System.out.println(max * 2);
            }
            else {  // 3-2)
                System.out.println(max * 2 + 1);
            }
        }
    }
}
