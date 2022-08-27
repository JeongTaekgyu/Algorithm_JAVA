package Programmers.Level_1;

public class 최소직사각형 {

    public static void swap(int[] arr){
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int max0 = 0;
        int max1 = 0;
        int[] arr = new int[2];

        for(int i = 0; i < sizes.length; i++){
            arr[0] = sizes[i][0];
            arr[1] = sizes[i][1];
            if(sizes[i][0] > sizes[i][1]){
                /*int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;*/

                swap(arr);
            }

            if(arr[0] > max0)
                max0 = arr[0];
            if(arr[1] > max1)
                max1 = arr[1];

            /*if(sizes[i][0] > max0)
                max0 = sizes[i][0];
            if(sizes[i][1] > max1)
                max1 = sizes[i][1];*/
        }

        answer = max0 * max1;
        return answer;
    }

    public static void main(String[] args) {
        int[][] sizes ={ {10,7}, {12,3}, {8,15}, {14,7}, {5,15} };
        System.out.println(solution(sizes));


    }
}
