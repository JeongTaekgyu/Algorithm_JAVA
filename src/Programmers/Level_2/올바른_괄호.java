package Programmers.Level_2;

import java.util.Stack;

public class 올바른_괄호 {

    static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        // 효율성 테스트 시간 초과 코드
        /* String[] tmpStr = s.split("");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < tmpStr.length; i++){
            if(stack.isEmpty()){
                stack.push(tmpStr[i]);
            } else if( stack.peek().equals("(") && tmpStr[i].equals(")") ){
                stack.pop();
            } else{
                stack.push(tmpStr[i]);
            }
        }*/

        // 아래 코드 또한 s가 아니라 String[] tmpStr로 하면 시간 초과 난다.
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(')
                stack.push('(');
            else {
                if(stack.isEmpty()) // ")"가 들어갈 자리인데 스택이 비어있으면 무조건 false
                    return false;
                else
                    stack.pop();    // ")"가 들어갈 순서인데 앞에 "("가 있는 경우 (무조건 "("경우에만 push를 해서 앞에는 "(" 밖에 없다 )
            }
        }

        answer = (stack.isEmpty()) ? true : false;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("((())())"));
    }
}
