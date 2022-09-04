package Programmers.Level_3;

public class 정수_삼각형 {

    public static int solution(int[][] triangle) {
        int answer = 0;

        int tmp = triangle.length;
        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];

        for(int i = 1; i < triangle.length; i++){
            dp[i][0] = triangle[i][0] + dp[i - 1][0];   // 맨 좌츨에 있는것들끼리 더하네

            for(int j = 1; j < i+1; j++){
                int a = dp[i - 1][j - 1];
                int b = dp[i - 1][j];
                dp[i][j] = triangle[i][j] + Math.max(dp[i - 1][j - 1], dp[i - 1][j]);   // 현재 위치 + 좌우 상부 중 최댓값
            }
        }

        int max = 0;
        for (int i = 0; i < dp[dp.length - 1].length; i++) {
            max = Math.max(dp[dp.length - 1][i], max);  // 맨 밑에 있는값 중에 최댓값을 구함
        }

        answer = max;
        return answer;
    }

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3,8}, {8,1,0}, {2,7,4,0}, {4,5,2,6,5}};
        System.out.println(solution(triangle));
    }
}
