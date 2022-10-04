package Baekjoon;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class _10816_숫자_카드_2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n; // 숫자 카드 개수
        int m; // 찾을 카드 개수
        HashMap<Integer, Integer> map;

        n = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        StringBuffer sb = new StringBuffer();

        // 숫자 카드 입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 처음 들어오는 숫자
            if(!map.containsKey(num)) {
                map.put(num, 1);
            }
            // 이미 있는 숫자라면 +1
            else {
                map.put(num, map.get(num) + 1);
            }
        }

        // 찾을 카드 입력
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 숫자가 존재하면 갯수 리턴
            if(map.containsKey(num)) {
                sb.append(map.get(num) + " ");
            }
            // 없다면 0
            else {
                sb.append(0 + " ");
            }
        }

//        System.out.println(sb.toString());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);
        int start, end, mid;

        int m = Integer.parseInt(br.readLine());
        int[] searchArr = new int[m];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < m; i++){
            searchArr[i] = Integer.parseInt(st.nextToken());
            start = 0;
            end = cards.length - 1;
            mid = (start + end)/2;
            while (searchArr[i] != cards[mid]) {
                if(start >= end)
                    break;
                if(searchArr[i] < cards[mid])
                    end = mid - 1;
                else if(searchArr[i] > cards[mid])
                    start = mid + 1;

                mid = (start + end)/2;
            }
        }

    }*/
}
