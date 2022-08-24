package Programmers.Level_2;

import java.util.PriorityQueue;

public class 더_맵게 {

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int tmp: scoville){
            pq.add(tmp);
        }

        // 근데 이해가 안가는게... 문제에 scoville 이 오름차순으로 정렬되어 있다고 안적혀 있었는데..
        while (pq.peek() < K ){
            if(pq.size() == 1)
                return -1;

            int min = pq.poll();
            int secmin = pq.poll();

            pq.add(min + secmin*2);
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 9, 3, 10, 12, 2};
        int k = 7;
        System.out.println(solution(scoville, k));
    }
}
