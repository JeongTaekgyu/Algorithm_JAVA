package Training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList_정렬_등 {

    public static void main(String[] args) {
        ArrayList test = new ArrayList();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> name2 = new ArrayList<String>();

        name.add("메시");
        name.add("호날두");
        name.add("네이마르");
        name.add(1,"음바페");
        name.add("호날두");

        for (int i = 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }
        System.out.println("---------------------");

        System.out.println(name.remove("호날두")); // 가장 처음거 지우나보다
        System.out.println(name.remove("앙리"));
        System.out.println("---------------------");

        for(String n : name){
            System.out.println(n);
        }
        System.out.println("---------------------");

        System.out.println(name);

        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches);  // [138, 129, 142] 출력

        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList("138", "129", "142"));
        String result = String.join(" ", pitches2); // join으로 합치기
        System.out.println("join으로 합치기 : "+result);

        // List.sort() - java8 이후
        pitches2.sort(Comparator.naturalOrder());
        System.out.println("List.sort() 오름차순 : "+pitches2);
        pitches2.sort(Comparator.reverseOrder());
        System.out.println("List.sort() 내림차순 : "+pitches2);

        // Collections.sort()
        Collections.sort(pitches2);
        System.out.println("Collections.sort() 오름차순 : " + pitches2);
        Collections.sort(pitches2,Collections.reverseOrder());
        System.out.println("Collections.sort() 내림차순 : " + pitches2);

//        출처:
//        https://wikidocs.net/207#generics
//        https://hianna.tistory.com/569
    }
}
