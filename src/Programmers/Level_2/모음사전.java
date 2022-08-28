package Programmers.Level_2;

import java.util.ArrayList;
import java.util.Collections;

public class 모음사전 {

    /*static char[] alphabet= {'A','E','I','O','U'};
    static ArrayList<String> list;

    public static int solution(String word) {
        int answer = 0;
        list= new ArrayList<>();

        combination(0, "");
        Collections.sort(list);
        answer= list.indexOf(word)+1;

        return answer;
    }

    public static void combination(int index, String str){
        if(index>=5)
            return;
        for(int i=0; i<alphabet.length; i++){
            list.add(str+alphabet[i]);
            combination(index+1, str+alphabet[i]);
        }
    } //comb*/

    // 풀이2 - 빠른 방법
    public static int solution(String word) {
        int answer = 0;
        int total= 3905;
        String aeiou = "AEIOU";

        for(String str: word.split("")){
            //781, 156, 31, 6, 1
            total /= 5;
            answer += total * aeiou.indexOf(str) +1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
    }
}
