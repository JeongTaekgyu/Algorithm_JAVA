package Training;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_1 {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<String> queue2 = new LinkedList<>();

        // 값 추가 add, offer
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.offer(4);

        System.out.println("queue1 : "+ queue1);

        // 값 삭제 poll, remove
        //queue1.poll();  // 큐 맨 앞에 있는 값을 반환하고 제거 비어있다면 null
        System.out.println(queue1.poll());
        //queue1.remove() // 큐 맨 앞에 있는 값을 반환하고 삭제 큐가 비어있는 경우 NoSuchElementException 발생
        System.out.println(queue1.remove());
        System.out.println("queue1 : "+ queue1);

        queue1.clear(); // queue 초기화
        System.out.println("clear 후 queue : " + queue1);

        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        System.out.println(queue1.peek());  // queue 에서 가장 먼저 들어간 값 출력

        if(queue1.isEmpty()){
            System.out.println("queue1 이 비어있습니다.");
        } else{
            System.out.println("queue1 이 비어있지 않습니다.");
        }
        
        queue1.clear();
        System.out.println("queue1.clear() 후");
        if(queue1.isEmpty()){
            System.out.println("queue1 이 비어있습니다.");
        } else{
            System.out.println("queue1 이 비어있지 않습니다.");
        }

        // size
        System.out.println(queue1.size());

        queue1.add(4);
        queue1.add(5);
        queue1.add(6);
        System.out.println(queue1);

    }
}
