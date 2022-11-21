package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1157_단어_공부 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.toUpperCase();
        HashMap<Character, Integer> map = new HashMap();
        List<Character> list = new ArrayList<>(); //리스트 선언

        int max = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(map.containsKey(c) ){
                map.put(c, map.get(c)+1 );
            }
            else {
                map.put(str.charAt(i), 1);
            }
            max = Math.max(max, map.get(c));
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }

        if(list.size() > 1)
            System.out.println("?");
        else
            System.out.println(list.get(0));
    }
}
