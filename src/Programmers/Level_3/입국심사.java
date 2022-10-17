package Programmers.Level_3;

public class 입국심사 {
    public static long solution(int n, int[] times) {
        long answer = 0;
        long left = 0;
        long right = (long) n * times[times.length-1];  // 가장 최악의 경우 시간(오래걸리는 시간)
        long mid;
        long sum = 0;

        while ( left <= right ){
            mid = (left + right)/2;
            sum = 0; // 총 심사한 인원
            // 빨리 심사하는 심사관 순으로 심사처리
            for(int i = 0; i < times.length; i++){
                sum += mid / times[i];
            }

            if(sum < n){
                left = mid + 1;
            } else {
                right = mid - 1;
                answer = mid;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] times = {7, 10};
        System.out.println(solution(6, times));
    }
}
