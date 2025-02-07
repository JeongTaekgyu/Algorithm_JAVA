package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _17413_단어_뒤집기_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = br.readLine();

        Stack<Character> stack = new Stack<>();
        boolean chk = true;
        StringBuilder sb = new StringBuilder();
        for(char ch : inputLine.toCharArray()){
            if(chk == true && (ch == '<' || ch == ' ')){
                while (!stack.isEmpty()){
                    sb.append(stack.pop());
                }
                sb.append(ch);

                if( ch == '<')
                    chk = false;
            }

            if(chk == true && ch != '>' && ch != ' '){
                stack.push(ch);
            }
            if(chk == false && ch != '<' && ch != '>'){
                sb.append(ch);
            }
            if(chk == false && ch == '>'){
                sb.append(ch);
                chk = true;
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.println(sb);
    }

}
