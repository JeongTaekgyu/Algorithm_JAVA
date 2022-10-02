package Programmers.Level_3;

import java.util.ArrayList;
import java.util.Collections;

public class 여행경로 {
    //boolean[] visited;
//    ArrayList<String> allRoute;

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        int cnt = 0;
        boolean[] visited = new boolean[tickets.length];
        ArrayList<String> allRoute = new ArrayList<>();

        dfs("ICN", "ICN", tickets, cnt, visited, allRoute);

        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");

        return answer;
    }

    public static void dfs(String start, String route, String[][] tickets, int cnt, boolean[] visited, ArrayList<String> allRoute){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }

        for(int i=0; i<tickets.length; i++){
            if(start.equals(tickets[i][0]) && !visited[i]){
                visited[i] = true;
                dfs(tickets[i][1], route+" "+tickets[i][1], tickets, cnt+1, visited, allRoute);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] answer = {};
        answer = solution(tickets);

        for( String ans : answer){
            System.out.println(ans);
        }
    }
}
