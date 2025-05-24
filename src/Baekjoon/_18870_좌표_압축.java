package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _18870_좌표_압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer n = Integer.valueOf(br.readLine());
        int arr[] = new int[n]; // 원본 배열
        int sortedArr[] = new int[n]; // 정렬할 배열

        HashMap<Integer, Integer> hashMap = new HashMap<>(); // 중복 제거된 맵

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            arr[i] = sortedArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(sortedArr);

        int idx = 0;
        for(int so : sortedArr){
            if(!hashMap.containsKey(so)){
                hashMap.put(so, idx);
                idx++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            sb.append(hashMap.get(arr[i])).append(' ');
        }

        System.out.println(sb);
    }
}
