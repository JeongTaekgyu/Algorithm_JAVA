package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1296_팀_이름_정하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String yeondooName = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String [] teamNames = new String[n];

        for(int i = 0; i < n; i++){
            teamNames[i] = br.readLine();
        }

        int yLcount = 0;
        int yOcount = 0;
        int yVcount = 0;
        int yEcount = 0;
        for(char ch : yeondooName.toCharArray()){
            if(ch == 'L') {
                yLcount++;
            } else if(ch == 'O') {
                yOcount++;
            } else if(ch == 'V') {
                yVcount++;
            } else if(ch == 'E') {
                yEcount++;
            }
        }

        // teamNames를 사전순으로 정렬
        Arrays.sort(teamNames);

        String answer = "";
        int remainder = -1;
        int maxRemainder = 0;
        for(String tName : teamNames){
            int tLcount = 0;
            int tOcount = 0;
            int tVcount = 0;
            int tEcount = 0;

            for(char ch : tName.toCharArray()){
                if(ch == 'L') {
                    tLcount++;
                } else if(ch == 'O') {
                    tOcount++;
                } else if(ch == 'V') {
                    tVcount++;
                } else if(ch == 'E') {
                    tEcount++;
                }
            }

            int Lcount = 0;
            int Ocount = 0;
            int Vcount = 0;
            int Ecount = 0;
            Lcount = yLcount + tLcount;
            Ocount = yOcount + tOcount;
            Vcount = yVcount + tVcount;
            Ecount = yEcount + tEcount;
            int score = (Lcount + Ocount) * (Lcount + Vcount ) * (Lcount + Ecount)
                    * (Ocount + Vcount) * (Ocount + Ecount) * (Vcount + Ecount);

            remainder = score % 100;
            if(remainder > maxRemainder) {
                maxRemainder = remainder;
                answer = tName;
            }

        }

        if(answer.equals("")) {
            answer = teamNames[0]; // 사전순으로 가장 앞서는 팀 이름
            System.out.println(answer);
        }
        else { // 이미 사전순이라 처음에 들어오는 answer가 가장 앞서는 팀 이름
            // 왜냐하면 if(remainder > maxRemainder) 에서 동일하면 못넘고 기존 remainder를 가지고 있는 teamName이 답이 된다.
            System.out.println(answer);
        }

    }
}
