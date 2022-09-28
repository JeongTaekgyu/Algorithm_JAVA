package Programmers.Level_2;

public class 타켓_넘버 {

    static int result = 0;

    public static int solution(int[] numbers, int target){
        int depth = 0;
        int sum = 0;
        dfs(numbers, target, depth, sum);
        return result;
    }

    public static void dfs(int[] numbers, int target, int depth, int sum) {

        if(depth == numbers.length){
            if(sum == target)
                result += 1;
            return;
        }

        dfs(numbers, target, depth+1, sum + numbers[depth]);
        dfs(numbers, target, depth+1, sum - numbers[depth]);
    }

    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;

        System.out.println(solution(numbers, target));
    }
}
