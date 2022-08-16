package Training;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_1 {

    public static void main(String[] args) {

        //낮은 숫자가 우선 순위인 Integer 형 우선순위 큐 선언
        PriorityQueue<Integer> priorQueueLowest = new PriorityQueue<>();

        //높은 숫자가 우선 순위인 Integer 형 우선순위 큐 선언
        PriorityQueue<Integer> priorQueueHighest = new PriorityQueue<>(Collections.reverseOrder());

        priorQueueLowest.add(1);
        priorQueueLowest.add(10);
        priorQueueLowest.offer(100);

        priorQueueHighest.add(1);
        priorQueueHighest.add(10);
        priorQueueHighest.offer(100);

        System.out.println("priorQueueLowest : " + priorQueueLowest);
        System.out.println("priorQueueHighest : " + priorQueueHighest);

        // poll
        Integer num = priorQueueLowest.poll();  // 첫번째 값을 반환하고 제거 비어있다면 null을 반환
        System.out.println("priorQueueLowest.poll() = " + num);
        System.out.println("priorQueueLowest : " + priorQueueLowest);

        // 첫번째 값 제거 비어있다면 예외 발생
        priorQueueLowest.remove();
        System.out.println("priorQueueLowest : " + priorQueueLowest);

        // 첫번째 값을 반환만 하고 제거 하지는 않는다.
        // 큐가 비어있다면 null을 반환
        Integer peekValue = priorQueueLowest.peek();
        System.out.println("peekValue : " + peekValue);

        // 첫번째 값을 반환만 하고 제거 하지는 않는다.
        // 큐가 비어있다면 예외 발생
        Integer element = priorQueueLowest.element();
        System.out.println("element : " + element);
        System.out.println("priorQueueLowest : " + priorQueueLowest);

        priorQueueLowest.offer(50);
        // 초기화
        priorQueueLowest.clear();
        System.out.println("priorQueueLowest : " + priorQueueLowest);

    }
}
