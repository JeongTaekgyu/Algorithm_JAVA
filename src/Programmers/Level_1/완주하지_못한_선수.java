package Programmers.Level_1;

import java.util.Arrays;

public class 완주하지_못한_선수 {

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < completion.length; i++){
            if( !participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        return participant[participant.length-1];
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }
}
