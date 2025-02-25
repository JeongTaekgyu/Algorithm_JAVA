package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _2822_점수_계산 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Map<Integer, Integer> map = new HashMap<>();

        int tmp = 0;
        for(int i = 1; i <= 8; i++){
            tmp = Integer.parseInt(br.readLine());
            map.put(i,tmp);
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        int sum = 0;
        int [] arr = new int[5];
        for (int i = 3; i < entryList.size(); i++) {
            sum += entryList.get(i).getValue();
            arr[i-3] = entryList.get(i).getKey();
        }
        System.out.println(sum);
        Arrays.sort(arr);
        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
