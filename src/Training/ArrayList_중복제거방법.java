package Training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ArrayList_중복제거방법 {

    public static void main(String[] args) {
        // 1. 배열의 요소를 로직을 통해서 중복 제거
        String[] goodsList = {"notebook", "TV", "monitor", "keyboard", "mouse", "TV", "monitor", "keyboard"};
        ArrayList<String> arrayList = new ArrayList<>();

        for(String item : goodsList){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }

        System.out.println("배열의 요소를 로직을 통해서 중복 제거 : " + arrayList);

        // 2. HashSet을 이용한 중복제거거
        String[] fruitsList = {"apple", "banana", "banana", "mango", "apple", "grape"};

        HashSet<String> hashSet = new HashSet<>();
        for(String item: fruitsList){
            hashSet.add(item);
        }

        System.out.println("hashSet을 이용한 중복제거 : " + hashSet);

        // 3. LinkedHashSet을 이용하여 중복제거
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for(String item : fruitsList){
            linkedHashSet.add(item);
        }

        System.out.println("LinkedHashSet을 이용하여 중복제거 : " +linkedHashSet);

        // 4. TreeSet을 이용하여 중복제거
        TreeSet<String> treeSet = new TreeSet<>();
        for(String item : fruitsList){
            treeSet.add(item);
        }

        System.out.println("TreeSet을 이용하여 중복제거 : " + treeSet);

        // 참고
        // https://lnsideout.tistory.com/entry/JAVA-%EC%9E%90%EB%B0%94-%EB%B0%B0%EC%97%B4-ArrayList-%EC%A4%91%EB%B3%B5%EC%A0%9C%EA%B1%B0-%EB%AA%A8%EB%93%A0%EB%B0%A9%EB%B2%95
    }
}
