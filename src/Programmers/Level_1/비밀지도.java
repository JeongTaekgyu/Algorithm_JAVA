package Programmers.Level_1;

public class 비밀지도 {

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i = 0; i < arr1.length; i++){
            // 2진수로 or 연산한다.
            String or = Integer.toBinaryString(arr1[i] | arr2[i]);
            // n자리 만큼 채운다.
            String number = String.format("%"+n+"s", or);
//            System.out.println("number : " + number);

            // '0' -> ' ' , '1' -> '#'' 으로 변경한다.
            answer[i] = number.replace('0', ' ').replace('1','#');
//            System.out.println("answer[i] : '" + answer[i]+"'");
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] answer = solution(n, arr1, arr2);
        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }

    }
}
