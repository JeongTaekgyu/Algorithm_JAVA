package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class _1157_단어_공부_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        int maxValue = Integer.MIN_VALUE;
        for(char c : chars){
            char lower = Character.toUpperCase(c);
            if(map.containsKey(lower)){
                map.put(lower, map.get(lower) + 1);
            } else {
                map.put(lower, 1);
            }
        }

        String answer = "";
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxValue){
                maxValue = entry.getValue();
                answer = entry.getKey().toString();
            } else if(entry.getValue() == maxValue){
                answer = "?";
            }
        }

        System.out.println(answer);
    }
}
