package Programmers.Level_2;

public class 다음_큰_숫자 {

    // 시간 초과나는 코드
    /*public static int solution(int n) {
        int answer = 0;

        String binaryString = Integer.toBinaryString(n);
        long cnt = binaryString.chars()
                .filter(c -> c == '1')
                .count();

        long cnt2;
        do {
            n++;
            String binaryStringTmp = Integer.toBinaryString(n);
            cnt2 = binaryStringTmp.chars()
                    .filter(c -> c == '1')
                    .count();
        } while (cnt != cnt2);

        answer = n;

        return answer;
    }*/

    // 방법1 - 성공
    /*public static int solution(int n) {
        int answer = 0;

        String binaryString = Integer.toBinaryString(n);
        int cnt1 = 0;
        for(int i = 0; i < binaryString.length(); i++){
            if (binaryString.charAt(i) == '1'){
                cnt1++;
            }
        }

        int cnt2;
        do {
            cnt2 = 0;
            n++;
            String binaryStringTmp = Integer.toBinaryString(n);

            for(int i = 0; i < binaryStringTmp.length(); i++){
                if (binaryStringTmp.charAt(i) == '1'){
                    cnt2++;
                }
            }
        } while (cnt1 != cnt2);

        answer = n;
        return answer;
    }*/

    // 방법2- 성공 - 시간 제일 짧음
    public static int solution(int n){
        int answer = 0;

        int cnt_1 = Integer.bitCount(n);    // 1의 개수를 count해주는 함수
        int cnt_2;
        do{
            n++;
            cnt_2 = Integer.bitCount(n);
        } while (cnt_1 != cnt_2);

        answer = n;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("answer : "+ solution(15));
    }
}
