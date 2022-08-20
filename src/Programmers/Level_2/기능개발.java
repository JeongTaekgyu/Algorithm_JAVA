package Programmers.Level_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int time = 0;
        int cnt = 0;
        ArrayList<Integer> ansList = new ArrayList<>();
        Queue<Integer> qProgresses = new LinkedList<>();
        Queue<Integer> qSpeeds = new LinkedList<>();
        for (int tmp : progresses){
            qProgresses.add(tmp);
        }
        for(int tmp: speeds){
            qSpeeds.add(tmp);
        }

        while (!qProgresses.isEmpty()){
            if( qProgresses.peek() + time * qSpeeds.peek() >= 100 ){
                qProgresses.poll();
                qSpeeds.poll();
                cnt++;
            }
            else {
                if(cnt > 0){
                    ansList.add(cnt);
                    cnt = 0;
                }
                time++;
            }
        }

        ansList.add(cnt);   // while문 끝나면 남은거 add 해준다

        answer = new int[ansList.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = ansList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1,30,5};

        int[] answer = solution(progresses, speeds);
        for(int ans: answer){
            System.out.println(ans);
        }
    }
}
