package Programmers.Level_2;

public class 조이스틱 {
    public static int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index; // 다음 값들을 확인할 때 사용
        int move = length - 1; // 좌우 움직임 수를 체크

        for(int i = 0; i < name.length(); i++){
            // 상하로 움직이는 부분 짧은걸 answer에 누적한다.
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            // 연속되는 A 갯수 확인
            while(index < length && name.charAt(index) == 'A'){
                index++;
            }

            // 순서대로 가는 것과, 뒤로 돌아가는 것 중 이동수가 적은 것을 선택
            move = Math.min(move, i * 2 + length - index);
            // BBBBAAAAAAAB 와 같이, 처음부터 뒷부분을 먼저 입력하는 것이 더 빠른 경우를 고려하려면 아래의 코드가 필요하다.
            move = Math.min(move, (length - index) * 2 + i);
        }
        return answer + move;
    }

    public static void main(String[] args) {
        System.out.println(solution("JEROEN"));
    }
}
