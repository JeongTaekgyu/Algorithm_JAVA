package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSet_1 {

    public static void main(String[] args) {
        // set 특징
        // 1. 중복을 허용하지 않는다.
        // 2. 순서가 없다(Unordered).
        HashSet<String> set = new HashSet<>(Arrays.asList("H","e","l","l","o"));

        System.out.println(set);

        Integer[] list = {1,2,3,4,5,6};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // 1. 교집합 구하기
        //HashSet<Integer> so = new HashSet<>(list); 이건 안된다.
        HashSet<Integer> s1 = new HashSet<>(arrayList);
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1);  // s1으로 intersection 생성
        intersection.retainAll(s2);  // 교집합 수행 retainAll
        System.out.println("교집합 : "+ intersection);
        
        // 2. 합집합 구하기
        HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
        union.addAll(s2);   // 합집합 수행 addAll
        System.out.println("합집합 : "+ union);
        
        // 3. 차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행 removeAll
        System.out.println("차집합 : " + substract);

        // 값 추가 add
        HashSet<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("banana");
        set2.add("grape");
        set2.add("banana");
        System.out.println("set2 : "+set2);

        // 값 여러개 추가 addAll
        // 참고로 합집합을 구할 때도 addAll을 사용했다.
        set2.add("strawberry");
        set2.addAll(Arrays.asList("apple", "mango"));
        System.out.println("set2 : "+ set2);

        // 특정 값 제거하기 remove
        set2.remove("apple");
        System.out.println("set2 : "+ set2);

        // removeAll
        set2.removeAll(Arrays.asList("banana", "mango"));
        System.out.println("set2 : "+set2);

    }

}
