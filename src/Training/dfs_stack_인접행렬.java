package Training;

import java.util.Stack;

public class dfs_stack_인접행렬 {
    static int vertex = 5;

    public static void solution() {
        int[][] graph = new int[vertex][6];
        graph[0][1] = graph[1][0]= 1;
        graph[0][2] = graph[2][0] = 1;
        graph[1][3] = graph[3][1] = 1;
        graph[1][4] = graph[4][1] = 1;
        graph[2][4] = graph[4][2] = 1;
        graph[3][4] = graph[4][3] = 1;

        dfs(0, graph);
    }

    public static void dfs(int startNode, int[][] graph) {
        boolean[] visited = new boolean[vertex];

        Stack<Integer> stack = new Stack<>();
        stack.push(startNode);

        while(stack.empty() == false) {
            int currentNode = stack.pop();

            if(visited[currentNode]) {
                continue;   // 이미 방문을 했으면 굳이 아래 검사할 필요없다.
            }   // 아래에서 검사하는건 방문하지 않은 노드만 stack에 push해주기 때문이다.

            visited[currentNode] = true;
            System.out.println(currentNode + "방문");
            for(int next = 0; next < vertex; next++) {
                if(visited[next] == false && graph[currentNode][next] != 0) {
                    stack.push(next);
                }
            }
        }
    }

    public static void main(String[] args) {

        solution();
    }
}
