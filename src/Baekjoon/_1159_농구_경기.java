package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1159_농구_경기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Character, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            String playerName = br.readLine();
            char ch = playerName.charAt(0);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        String answer = "";
        for(Map.Entry<Character, Integer> resultMap : map.entrySet()){
            if(resultMap.getValue() >= 5){
                answer += resultMap.getKey();
            }
        }

        if(answer.equals("")){
            System.out.println("PREDAJA");
        }
        else {
            System.out.println(answer);
        }
    }
}
