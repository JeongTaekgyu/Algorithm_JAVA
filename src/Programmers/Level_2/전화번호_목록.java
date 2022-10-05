package Programmers.Level_2;

import java.util.Arrays;
import java.util.HashMap;


public class 전화번호_목록 {

    public static boolean solution(String[] phone_book) {

        // 첫 번쨰 방법
        /*Arrays.sort(phone_book);

        // startsWith()함수는 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수이다.
        // 해당 문자열로 시작되는지 여부를 확인하고 boolean에 맞춰 true/false 값을 리턴한다.
        for(int i = 0; i < phone_book.length - 1; i++ ){
            if(phone_book[i + 1].startsWith(phone_book[i]))
                return false;
        }*/
        
        // 두번쨰 방법
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);

        for (int i = 0; i < phone_book.length; i++){
            for (int j = 1; j < phone_book[i].length(); j++){
                String tmp = phone_book[i].substring(0, j);
                if (map.containsKey(tmp))
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"964","123","1235","567","88"};
        System.out.println(solution(phone_book));

    }
}
