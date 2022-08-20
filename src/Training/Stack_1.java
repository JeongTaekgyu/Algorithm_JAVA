package Training;

import java.util.Stack;

public class Stack_1 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 값 추가 push
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("stack : " +stack);

        // 스택 값 삭제 pop
        stack.pop();
        System.out.println("stack : " +stack);

        // 스택 값 전부 삭제 clear
        stack.clear();
        System.out.println("stack : " +stack);

        stack.push(5);
        stack.push(3);
        // stack 최상단값 반환 peek
        Integer peekValue = stack.peek();
        System.out.println("peekValue : " + peekValue);
        //System.out.println("stack.peek() : " + stack.peek());
        System.out.println("stack : " +stack);

        // stack이 비어있는지 확인
        if(stack.empty())
            System.out.println("stack이 비어있습니다");
        else
            System.out.println("stack이 비어있지 않습니다.");

        // stack에 특정값이 있는지 contains
        System.out.println(stack.contains(3));

        // size
        System.out.println(stack.size());

        // 스택의 인덱스번째 값을 출력 elemanetAt(index)
        System.out.println(stack);
        System.out.println(stack.elementAt(0));
        System.out.println(stack.elementAt(1));
        System.out.println(stack.elementAt(stack.size()-1));

        stack.clear();
        stack.peek();

    }

}
