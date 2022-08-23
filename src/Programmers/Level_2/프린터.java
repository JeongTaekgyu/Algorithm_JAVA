package Programmers.Level_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프린터 {
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int tmp : priorities){
            pq.add(tmp);
        }

        while (!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++ ){
                if(priorities[i] == pq.peek()){
                    answer++;
                    if(i == location){
                        return answer;
                    }
                    pq.poll();
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] priorities = {2,1,3,2};
        int location = 2;
        System.out.println(solution(priorities, location));
    }
}
