package Programmers.Level_1;

public class 소수_찾기 {

    public static int solution(int n){
        int answer = 0;
        boolean[] notPrimeCheck = new boolean [n+1]; // default값이 false이다.
        notPrimeCheck[0] = notPrimeCheck[1] = true;

        //제곱근 구하기
        int root = (int)Math.sqrt(notPrimeCheck.length);
        // i는 2부터 하는게 맞다 왜냐하면 애초에 에라토스테네스의 체를 이해하면
        // 1 ~ n 사이의 소수를 구해도 i는 2로 해야하지 2를 제외한 2의 제곱부터 시작한 2의 배수들을 소수목록에서 제거해야하기 때문에
        for(int i = 2; i <= root; i++){ //2~루트n까지 검사
            if(notPrimeCheck[i] == false){
                for(int j = i*i; j < notPrimeCheck.length; j = j+i){
                    notPrimeCheck[j] = true;    // 소수가 아닌걸 표시한다.
                }
            }
        }

        for(int i = 1; i <= n; i++) {
            if(!notPrimeCheck[i])   // 소수이면
                answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(11));
    }

}
