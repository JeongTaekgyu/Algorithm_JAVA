package Training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMap_1 {

    public static void main(String[] args) {

        // Map은 key는 중복 불가, value는 중복 가능하다.
        HashMap<String, String> map = new HashMap<>();
        
        // 1. put
        map.put("people", "사람");
        map.put("baseball", "야구");
        map.put("football", "축구");
        map.put("people2", "사람");

        // 2.get
        System.out.println(map.get("people"));
        System.out.println(map.get("java"));   // key가 없으면 null을 반환한다.
        System.out.println(map.get("baseball"));

        // key값이 업을 때 null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메소드를 사용한다.
        System.out.println(map.getOrDefault("java", "자바"));  // "자바" 출력


        // 3. containsKey
        // containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴한다.
        System.out.println(map.containsKey("people"));  // true 출력
        System.out.println(map.containsKey("java"));    // false 출력

        System.out.println("--------------------------");
        // 4. remove
        System.out.println(map.remove("people"));   // 삭제한 key의 value가 출력된다.
        System.out.println(map.remove("python"));   // key가 업으면 null을 반환

        // 5. size
        System.out.println(map.size());

        // 6. KeySet
        // keySet은 맵(Map)의 모든 Key를 모아서 리턴한다.
        System.out.println("keySet으로 key들을 출력 : " + map.keySet());

        // keySet() 메소드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴한다.
        // Set 자료형은 다음과 같이 List 자료형으로 바꾸어 사용할수도 있다.
        List<String> keyList = new ArrayList<>(map.keySet());

        System.out.println("keyList : " + keyList);

    }
}
