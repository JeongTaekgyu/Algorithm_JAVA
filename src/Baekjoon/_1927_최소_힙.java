package Baekjoon;

import java.io.*;
import java.util.PriorityQueue;

public class _1927_최소_힙 {

    public static void main(String[] args) throws IOException {
        // 방법1
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            if(m == 0){
                if(pq.isEmpty())
                    System.out.println(0);
                else
                    System.out.println(pq.poll());
            } else {
                pq.add(m);
            }
        }*/

        // 방법2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int num = Integer.parseInt(br.readLine());

        int input;
        for(int i = 0; i < num; i++){
            input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(minHeap.isEmpty()){  // 힙이 비어 있는 경우
                    bw.write("0\n");
                    //System.out.println("0\n");
                } else{ // 비어 있지 않은 경우
                    bw.write(minHeap.poll() + "\n");
                    //System.out.println(minHeap.poll()+"\n");
                    //minHeap.poll(); // heap의 첫번째 값을 반환하고 제거, 비어있다면 null 반환??
                }
            } else{
                minHeap.add(input);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
