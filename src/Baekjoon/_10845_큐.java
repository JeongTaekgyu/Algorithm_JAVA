package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class _10845_큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        String inputLine;
        String command;
        int num;
        Integer rearNum = null;
        for(int i = 0; i < n; i++){
            inputLine = br.readLine();
            command = inputLine.split(" ")[0];
            switch (command){
                case "push":
                    num = Integer.parseInt(inputLine.split(" ")[1]);
                    queue.offer(num);
                    rearNum = num;
                    break;
                case "pop":
                    if(queue.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "front":
                    if(queue.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(queue.peek());
                    break;
                case "back":
                    if(queue.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(rearNum);
                    break;
            }

        }
    }
}
