package Programmers.Level_1;

public class 신규_아이디_추천 {

    public static String solution(String new_id) {
        String answer = "";

        // 1단계
        new_id =  new_id.toLowerCase();

        // 2단계
        for(int i = 0; i < new_id.length(); i++){
            if ( (new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z') ||
                (new_id.charAt(i) >= 48 && new_id.charAt(i) <= 57) ||
                (new_id.charAt(i) == '-') ||
                (new_id.charAt(i) == '_') ||
                (new_id.charAt(i) == '.')
            ) {
                // answer += new_id.charAt(i); // 이거 실행시간 오래 걸린다.
                answer += String.valueOf(new_id.charAt(i)); // 이게 실행시간 적게 걸린다.
            }
        }

        // 3단계
        // indexOf(문자열)는 특정 문자를 찾으면 해당 문자의 인덱스값(앞에서 부터 처음 발견되는)을 반환하고
        // 못 찾으면 -1을 반환함
        while (answer.indexOf("..") != -1) {
            answer = answer.replace("..", ".");
        }

        // 4단계 위에서 이미 . 이 연속으로 오는 경우는 제거해서 .은 연속으로 오지 않기때문에 여기서 while문 안돌아도 된다.
        if( answer.charAt(0) == '.' ){
            answer = answer.substring(1);
        } else if( answer.charAt(answer.length() - 1) == '.'){
            answer = answer.substring(0, answer.length()-1);
        }

        // 5단계
        if ( answer.equals("") ){
            answer = "a";
        }

        // 6단계
        if(answer.length() >= 16){
            answer = answer.substring(0, 15);

            // 왜 안에 넣으면 안된다.
            /*if(answer.charAt(answer.length()-1) == '.'){
                answer = answer.substring(0, answer.length()-1);
            }*/
        }
        if(answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0, answer.length()-1);
        }

        // 7단계
        while (answer.length() <=2){
            answer += answer.charAt(answer.length()-1);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("=.="));
    }
}
