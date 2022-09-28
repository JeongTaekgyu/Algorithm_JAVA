package Programmers.Level_3;

public class 네트워크 {

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(i, computers, visited);
                answer += 1;
            }
        }

        return answer;
    }

    public static void dfs(int v, int[][] computers, boolean[] visited) {
        visited[v] = true;

        for(int i = 0; i < computers.length; i++){
            if(computers[v][i] == 1 && !visited[i])
                dfs(i, computers, visited);
        }
    }

    public static void main(String[] args) {
        int[][] computers = { {1,1,0}, {1,1,0}, {0,0,1} };
        int answer = solution(3, computers);
        System.out.println("answer : " + answer);
    }
}
