package Baekjoon.Level_1;

public class 로또의_최고_순위와_최저_순위 {

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int equalsCnt = 0;
        int zeroCnt = 0;

        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0)
                zeroCnt++;
            for(int j = 0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    equalsCnt++;
                    break;
                }
            }
        }

        if(zeroCnt + equalsCnt == 6){
            answer[0] = 1;
            answer[1] = 1 + zeroCnt;
        } else if(zeroCnt + equalsCnt == 5){
            answer[0] = 2;
            answer[1] = 2 + zeroCnt;
        } else if(zeroCnt + equalsCnt == 4){
            answer[0] = 3;
            answer[1] = 3 + zeroCnt;
        } else if(zeroCnt + equalsCnt == 3){
            answer[0] = 4;
            answer[1] = 4 + zeroCnt;
        } else if(zeroCnt + equalsCnt == 2){
            answer[0] = 5;
            answer[1] = 5 + zeroCnt;
        } else {
            answer[0] = 6;
            answer[1] = 6;
        }

        if(answer[1] > 6)
            answer[1] = 6;

        return answer;
    }

    public static void main(String[] args) {
        int[] lottos = {45, 4, 35, 20, 3, 9};
        int[] win_nums = {20, 9, 3, 45, 4, 35};
        int[] answer;

        answer = solution(lottos, win_nums);
        for(int ans : answer)
            System.out.println(ans);

    }
}
