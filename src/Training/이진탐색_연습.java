package Training;

import java.util.Arrays;

public class 이진탐색_연습 {

    public static void main(String[] args) {
        int[]arr = {2,7,8,14,11,3,20,5,15,12};
        Arrays.sort(arr);

        int search = 7;
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        int cnt = 1;

        while (search != arr[mid]){
            if(search < arr[mid]){
                end = mid - 1;
            }
            else if(search > arr[mid]){
                start = mid + 1;
            }
            mid = (start + end)/2;
            cnt++;
        }

        System.out.println("cnt : " + cnt);
        System.out.println("search : " + arr[mid]);
    }
}
