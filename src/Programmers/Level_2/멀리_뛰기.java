package Programmers.Level_2;

public class 멀리_뛰기 {
    public static long solution(int n) {
        if(n < 3)
            return n;

        long[] arr = new long[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i < arr.length; i++){
            arr[i] = (arr[i-2] + arr[i-1]) % 1234567;
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(80));
    }
}
