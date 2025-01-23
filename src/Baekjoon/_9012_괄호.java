package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _9012_괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> answerList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            String line = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(char ch : line.toCharArray()){
                if(ch == '(') {
                    stack.push(ch);
                }
                else if(!stack.isEmpty() && ch == ')') { // stack의 top이 '('
                    stack.pop();
                }
                else if(stack.isEmpty() && ch == ')') {
                    stack.push('x');
                    break;
                }
            }

            if(stack.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

    }
}
