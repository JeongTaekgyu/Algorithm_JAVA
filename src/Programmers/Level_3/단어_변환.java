package Programmers.Level_3;

import java.util.LinkedList;
import java.util.Queue;

public class 단어_변환 {

    public static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }
    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visit = new boolean[words.length];

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(begin, 0));

        while (!queue.isEmpty()){
            Node curnode = queue.poll();

            if(curnode.next.equals(target)){
                answer = curnode.edge;
                break;
            }

            for (int i = 0; i < words.length; i++ ){
                if (!visit[i] && isNext(curnode.next, words[i])) {
                    visit[i] = true;
                    queue.add(new Node(words[i], curnode.edge + 1));
                }
            }
        }

        return answer;
    }

    public static boolean isNext(String cur, String n) {
        int cnt = 0;
        for (int i=0; i < n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                if (++ cnt > 1) return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution(begin, target, words));
    }
}
