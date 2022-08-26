package Programmers.Level_1;

import java.util.ArrayList;
import java.util.Collections;

public class K번째수 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < commands.length; i++){
            for(int j = commands[i][0] - 1; j < commands[i][1]; j++){
                arrayList.add(array[j]);
            }
            Collections.sort(arrayList);
            answer[i] = arrayList.get(commands[i][2]-1);
            arrayList.clear();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        int answer[] = solution(array, commands);

        for(int tmp : answer){
            System.out.println(tmp);
        }

    }
}
