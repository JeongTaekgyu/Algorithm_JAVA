package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _1874_스택_수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            result[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1, j = 0; i <= n; i++){
            if(i <= result[j]){
                stack.push(i);
                sb.append("+\n");
            }

            while (!stack.isEmpty() && stack.peek() == result[j]){
                stack.pop();
                sb.append("-\n");
                j++;
            }
        }

        if(stack.isEmpty())
            System.out.println(sb);
        else
            System.out.println("NO");
    }
}
