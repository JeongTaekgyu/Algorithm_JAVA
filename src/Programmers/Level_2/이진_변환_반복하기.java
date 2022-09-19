package Programmers.Level_2;

public class 이진_변환_반복하기 {

    public static int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1){
            int cntOne = 0;
            for(int i = 0; i < s.length(); i++ ){
                if(s.charAt(i) == '0')
                    answer[1]++;
                else
                    cntOne++; // 1의 길이 세기
            }

            s = Integer.toBinaryString(cntOne); // 0 제거후 1의 길이
            answer[0]++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] answer = new int[2];
        answer = solution("110010101001");
        for(int ans : answer)
            System.out.println(ans);
    }
}
