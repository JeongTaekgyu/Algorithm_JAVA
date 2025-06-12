package Training;

import java.util.ArrayList;
import java.util.List;

public class _조합_Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4}; // 조합을 구할 대상 배열
        int r = 2; // 선택할 개수

        List<List<Integer>> result = new ArrayList<>(); // 조합 결과를 저장할 리스트
        combination(arr, new ArrayList<>(), 0, r, result); // 조합 함수 호출

        // 결과 출력
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }

    /**
     * 조합을 구하는 재귀 함수 (백트래킹 방식)
     *
     * @param arr     원본 배열 (조합을 구할 대상)
     * @param temp    현재까지 선택된 원소들을 저장하는 리스트
     * @param start   현재 조합을 만들기 시작할 배열의 인덱스
     * @param r       총 선택해야 하는 원소 개수
     * @param result  완성된 조합들을 저장할 리스트
     */
    public static void combination(int[] arr, List<Integer> temp, int start, int r, List<List<Integer>> result) {
        // 기저 조건: r개의 원소를 선택했으면 결과 리스트에 추가하고 종료
        if (temp.size() == r) {
            result.add(new ArrayList<>(temp)); // temp 리스트의 복사본을 저장 (깊은 복사)
            return;
        }

        // 배열을 순회하며 조합을 생성
        for (int i = start; i < arr.length; i++) {
            temp.add(arr[i]); // 현재 원소를 선택
            combination(arr, temp, i + 1, r, result); // 다음 원소 선택 (재귀 호출)
            temp.remove(temp.size() - 1); // 백트래킹: 마지막으로 추가한 원소를 제거하여 이전 상태로 되돌림
        }
    }
}
