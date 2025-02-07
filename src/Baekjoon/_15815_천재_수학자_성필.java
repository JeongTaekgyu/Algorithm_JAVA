package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _15815_천재_수학자_성필 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();
        Stack<Integer> stack = new Stack<>();
        int tmp = 0;

        for(char ch : inputLine.toCharArray()){
            if(ch >= '0' && ch <= '9'){
                stack.push(ch - '0');
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (ch){
                    case '*':
                        tmp = num1 * num2;
                        break;
                    case '/':
                        tmp = num2 / num1;
                        break;
                    case '+':
                        tmp = num1 + num2;
                        break;
                    case '-':
                        tmp = num2 - num1;
                        break;
                }
                stack.push(tmp);
            }
        }

        System.out.println(stack.peek());
    }
}
