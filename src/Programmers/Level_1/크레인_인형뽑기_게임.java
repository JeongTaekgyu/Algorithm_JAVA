package Programmers.Level_1;

import java.util.Stack;

public class 크레인_인형뽑기_게임 {

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    stack.push(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }

            if(stack.size() >=2){
                if(stack.elementAt(stack.size()-2) == stack.peek()){
                    stack.pop();
                    stack.pop();
                    answer += 2;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0,0},
                {0,0,1,0,3},
                {0,2,5,0,1},
                {4,2,4,4,2},
                {3,5,1,3,1}};
        int[] moves ={1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }
}
