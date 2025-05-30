package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _1755_숫자놀이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        String[] digitWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        ArrayList<String> result = new ArrayList<>();

        for(int i = m; i <= n; i++){
            String str = String.valueOf(i);
            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < str.length(); j++){
                int digit = str.charAt(j) - '0';

                sb.append(digitWords[digit]);
                if(j != str.length() - 1){
                    sb.append(" ");
                }

            }

            result.add(sb.toString());
        }

        Collections.sort(result);

        Map<String, String> wordToDigit = new HashMap<>();
        wordToDigit.put("zero", "0");
        wordToDigit.put("one", "1");
        wordToDigit.put("two", "2");
        wordToDigit.put("three", "3");
        wordToDigit.put("four", "4");
        wordToDigit.put("five", "5");
        wordToDigit.put("six", "6");
        wordToDigit.put("seven", "7");
        wordToDigit.put("eight", "8");
        wordToDigit.put("nine", "9");

        List<Integer> restoredNumbers = new ArrayList<>();
        for (String wordStr : result) {
            String[] parts = wordStr.split(" ");
            StringBuilder numberStr = new StringBuilder();
            for (String part : parts) {
                numberStr.append(wordToDigit.get(part));
            }
            restoredNumbers.add(Integer.parseInt(numberStr.toString()));
        }


        int cnt = 0;
        for(int num : restoredNumbers){
            System.out.print(num+" ");
            cnt++;
            if(cnt % 10 == 0){
                System.out.println();
            }
        }
    }
}