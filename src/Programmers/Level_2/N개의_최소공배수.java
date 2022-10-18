package Programmers.Level_2;

public class N개의_최소공배수 {
    // 문제 맞으려면 이걸 solution 함수로 써야함
    public static int getLCM(int[] arr) {
        if(arr.length == 1)
            return arr[0];

        // 숫자가 여러개이면
        int gcd = getGCD(arr[0], arr[1]);
        int lcm = (arr[0] * arr[1]) / gcd;

        for(int i = 2; i < arr.length; i++) {
            // 최소공배수와, arr[i]의 최대공약수를 구한다.(최소공배수를 구하기위해 최대공약수를 구한다.
            gcd = getGCD(lcm, arr[i]);
            // 최소 공배수를 구한다.
            lcm = (lcm * arr[i]) / gcd;
        }

        System.out.println("GCD : " + gcd);
        return lcm;
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};

        System.out.println("LCM : " + getLCM(arr));
        
        // 아래는 2개의 gcd, lcm 구할 때
        /*int num1 = 60;
        int num2 = 48;

        // 최대공약수 gcd, 최소공배수 lcm
        // a % b = r 일때 a,b 의최대공약수는 b,r 의 최대 공약수와 같다.
        // 최소공배수 = (a*b)/최대공약수 와 같다.
        // 이게 유클리드 호제법이며 a > b 일때 적용된다.
        int gcd = getGCD(num1, num2);
        System.out.println("the greatest common denominator : " + gcd);
        System.out.println("the lowest common multiple : " + (num1 * num2) / gcd);*/
    }

    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2);
    }
}
