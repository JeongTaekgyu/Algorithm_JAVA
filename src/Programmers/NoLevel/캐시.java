package Programmers.NoLevel;

import java.util.LinkedList;

public class 캐시 {
    public static int solution(int cacheSize, String[] cities) {
        if(cacheSize == 0)
            return cities.length * 5; // 캐시사이즈가 0 이면 전부 cache miss 이다.

        int answer = 0;
        LinkedList<String> cache = new LinkedList<>();

        for(int i = 0; i < cities.length; i++){
            String s = cities[i].toUpperCase();
            if(cache.remove(s)){ // cache hit 이면
                answer += 1; // 실행시간 +1
                cache.add(s);
            }else{ // cache miss이면
                answer += 5; // 실행시간 +5
                if(cache.size() >= cacheSize){ // 캐시 사이즈 도달하면
                    // LRU(Least Recently Used)방식으로 가장 오랫동안 사용하지 않은 cache를 지운다.
                    cache.remove(0);
                }
                cache.add(s); // 위에서 오래된 캐시 지웠으면 새로운 걸 캐시에 넣는다.
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
        int cacheSize = 3;

        System.out.println(solution(cacheSize, cities));
    }
}
