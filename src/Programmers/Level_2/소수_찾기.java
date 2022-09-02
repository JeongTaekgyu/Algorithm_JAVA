package Programmers.Level_2;

import java.util.HashSet;
import java.util.Set;

public class 소수_찾기 {

    /*public static int solution(String numbers) {
        int answer = 0;
        String[] tmpStr = numbers.split("");

        for(int i = 2; i < Math.sqrt(tmpStr.length); i++){

            for(int j = i*i; j < tmpStr.length; j = j+1){

            }
        }
        return answer;
    }*/

    public static int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        // 모든 조합
        combination(numbers, "", set);
        // 소수 판별
        int answer = 0;
        for (Integer num : set) {
            int i;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }
            }
            if (i == num) {
                answer++;
            }
        }
        return answer;
    }

    public static void combination(String numbers, String str, Set<Integer> set) {
        int len = numbers.length();
        if (!"".equals(str)) {
            set.add(Integer.valueOf(str));
        }
        for (int i = 0; i < len; i++) {
            combination(numbers.substring(0, i) + numbers.substring(i + 1, len), str + numbers.charAt(i), set);
        }
    }

    public static void main(String[] args) {
        String numbers = "017";
        System.out.println(solution(numbers));
    }
}
