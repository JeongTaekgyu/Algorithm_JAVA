package Programmers.Level_1;

import java.util.*;

public class 신고_결과_받기 {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        answer = new int[id_list.length];

        /* key 는 유저ID
         * value 는 신고한 유저ID의 set 을 가진 reportedIdCountMap
         * 동일한 유저ID에 대한 신고횟수는 1회로 처리하기 때문에 중복 허용을 하지 않는 set 을 value 로 사용
         */
        Map<String, HashSet<String>> reportedMap = new HashMap<>(); // [신고된ID, [신고한ID]]
        Map<String, Integer> answerMap = new HashMap<>(); // [신고된Id, 메일 수]


        // 1. Map 초기화
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> reportingId = new HashSet<>(); // 신고한ID
            reportedMap.put(id_list[i], reportingId); // 유저ID, 신고한ID 초기 세팅
            answerMap.put(id_list[i], 0);  // 메일 수는 모두 0 으로 초기화
        }
        System.out.println("[STEP 1] reportedMap : " + reportedMap);
        System.out.println("[STEP 1] answerMap : " + answerMap);


        /* 2. 신고 기록 세팅 report 는 "신고한ID 신고된ID" 로 구성됨 */
        for (String s : report) {
            String[] reportStr = s.split(" ");
            String reportingID = reportStr[0]; // 신고한ID
            String reportedID = reportStr[1]; // 신고된ID
            reportedMap.get(reportedID).add(reportingID); // 신고된ID 를 key 값으로 신고한ID 배열을 value 로 새팅
        }
        System.out.println("[STEP 2] reportedMap 에 신고 기록 세팅 : " + reportedMap);



        /* 3. 유저가 받은 이용 정지 결과 메일 세팅 */
        for (String reportedUser : reportedMap.keySet()) { // reportedUser 는 신고된ID유저
            HashSet<String> userForSend = reportedMap.get(reportedUser); // reportedUser(신고된유저)를 신고한 유저
            if (userForSend.size() >= k) { // 신고된 횟수가 K번 이상일 경우
                for (String userId : userForSend) {
                    answerMap.put(userId, answerMap.get(userId) + 1); // answerMap 에 신고된Id 별 메일 수 넣기
                }
            }
        }
        System.out.println("[STEP 3] answerMap 에 메일 수 세팅 : " + answerMap);


        /* 4. 유저ID 별 받은 메일 수를 answer 에 세팅 */
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
            System.out.println("[STEP 4] answer : " + answer[i]);
        }

        return answer;

        /*int[] answer = {};
        answer = new int[id_list.length];

        Set<String> setReport = new HashSet<String>(Arrays.asList(report));
        HashMap<String, Integer> reportedIdCountMap = new HashMap<>();// 신고당한놈 몇 번 신고당했는지 횟수
        Map<String, Integer> answerMap = new HashMap<>(); // [신고된Id, 메일 수]

        for (String id: id_list ) {
            System.out.println("id : "+ id);
            reportedIdCountMap.put(id, 0);
            answerMap.put(id, 0);
        }

        for (String s:setReport ) {
            String[] tmpStr = s.split(" ");
            String reportingId = tmpStr[0];
            String reportedId = tmpStr[1];
            Integer value = reportedIdCountMap.get(reportedId);
            reportedIdCountMap.put(reportedId, value + 1); // 신고당한놈 몇 번 신고당했는지 횟수
        }

        for (String s:setReport ) {
            String[] tmpStr = s.split(" ");
            String reportingId = tmpStr[0];
            String reportedId = tmpStr[1];
            if ( reportedIdCountMap.get(reportedId) >= 2 ){
                answerMap.put(reportingId, answerMap.get(reportingId) + 1);
            }
        }

        System.out.println("몇번 신고 당했는지 reportedIdCountMap : " + reportedIdCountMap);
        System.out.println("setReport : "+setReport);
        System.out.println("신고한사람한테간 메일 횟수 answerMap : " + answerMap);

        for (int i = 0; i < id_list.length; i++ ){
            answer[i] = answerMap.get(id_list[i]);
        }

        return answer;*/
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi","frodo neo"};
        //String[] id_list = {"con", "ryan"};
        //String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int answer[] = {};
        int k = 2;
        answer = solution(id_list, report, k);
        for(int n : answer){
            System.out.println("n : " + n);
        }
    }
}
