package Programmers.Level_2;

import java.util.ArrayList;

public class 방문_길이 {

    public static int solution(String dirs) {
        String[] strArr = dirs.split("");
        int x = 0;
        int y = 0;
        ArrayList<String> visit = new ArrayList<String>();

        for(int i = 0; i < strArr.length; i++) {
            int beforeX = x;
            int beforeY = y;

            if(strArr[i].equals("L") && x > -5){
                x--;
            } else if(strArr[i].equals("R") && x < 5){
                x++;
            } else if(strArr[i].equals("U") && y < 5){
                y++;
            } else if(strArr[i].equals("D") && y > -5){
                y--;
            }

            /* 방문 중복 체크
            중복된 이동일 경우 반환값을 증가하지 않음. 중복값 체크를 위해 ArrayList를 선언하고
            이동 전 좌표 + 이동 후 좌표, 이동 후 좌표 + 이동 전 좌표의 값을 저장함
            현재 좌표 + 이동 좌표만 저장하면 이동 좌표 → 현재 좌표로 이동한 것은 새로운 이동이라 볼 수 있기에
            현재 → 이동과 이동 → 현재 경우를 모두 저장함. */
            String afterXY = Integer.toString(x);
            afterXY += Integer.toString(y);
            String beforeXY = Integer.toString(beforeX);
            beforeXY += Integer.toString(beforeY);
            String ab = afterXY + beforeXY;  // 이동 후 좌표 + 이동 전 좌표
            String ba = beforeXY + afterXY;  // 이동 전 좌표 + 이동 후 좌표

            if( !visit.contains(ab) && !visit.contains(ba) && !ab.equals(ba)){
                visit.add(ab);
                visit.add(ba);
            }
        }

        return visit.size() / 2;
    }

    public static void main(String[] args) {
        System.out.println(solution("LLLLLLLLLLLLUUDR"));
    }
}
