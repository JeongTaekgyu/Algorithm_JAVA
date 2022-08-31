package Programmers.Level_1;

import java.util.Arrays;

public class 체육복 {

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌 체육복을 가져온 학생이 도난당한 경우
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        // 도난당한 학생에게 체육복을 빌려주는 경우
        for(int i=0; i < lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                    answer++;
                    reserve[j] = -1;    // 더 이상 체육복을 빌려줄 수 없음
                    break;
                }
            }
        }

        return n - lost.length + answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] lost = {2,4};
        int[] reserve = {1,2,5};
        System.out.println(solution(n, lost, reserve));
    }
}
