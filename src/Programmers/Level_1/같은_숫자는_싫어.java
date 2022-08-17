package Programmers.Level_1;

import java.util.ArrayList;
import java.util.Stack;

public class 같은_숫자는_싫어 {

    public static int[] solution(int []arr) {
        // 풀이 1
        /*int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++ ){

            if(stack.isEmpty())
                stack.push(arr[i]);
            else{
                if(stack.peek() != arr[i])
                    stack.push(arr[i]);
            }
        }

        answer = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++){
            answer[i] = stack.elementAt(i);
        }*/

        // 풀이 2
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i <= arr.length-2; i++){
            if(arr[i] == arr[i+1]){
                continue;
            } else{
                list.add(arr[i]);
            }
        }
        // 위에서 arr의 마지막 인덱스에 있는 값은 list에 add 하지 못해서
        // arr의 마지막 인덱스에 있는 값을 list에 넣어준다.
        list.add(arr[arr.length-1]);

        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = list.get(i);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1,7};
        int[] answer = solution(arr);
        for(int ans : answer){
            System.out.println(ans);
        }
    }
}
