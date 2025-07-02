package Training;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;  // 배열이 1개 이하라면 종료

        int mid = left + (right - left) / 2;  // 중간 지점 계산

        mergeSort(arr, left, mid);     // 왼쪽 부분 정렬
        mergeSort(arr, mid + 1, right); // 오른쪽 부분 정렬
        merge(arr, left, mid, right);   // 정렬된 두 부분을 병합
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid + 1);
        int[] rightArr = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;

        // 두 배열을 병합
        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // 남은 요소 처리
        while (i < leftArr.length) arr[k++] = leftArr[i++];
        while (j < rightArr.length) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 5, 2, 7, 4, 1};
        System.out.println("정렬 전: " + Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
