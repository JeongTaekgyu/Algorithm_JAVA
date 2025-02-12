package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _1010_다리_놓기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0; i < num; i++ ){
            st = new StringTokenizer(br.readLine(), " ");
            BigInteger n = BigInteger.valueOf(Integer.parseInt(st.nextToken()));
            BigInteger m = BigInteger.valueOf(Integer.parseInt(st.nextToken()));

            BigInteger result = factorial(m).divide( factorial(m.subtract(n)).multiply(factorial(n)) );

            System.out.println(result);
        }
    }

    public static BigInteger factorial(BigInteger n){
        if(n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE) )
            return BigInteger.ONE;
        else
            return n.multiply( factorial(n.subtract(BigInteger.ONE)) );
    }
}
