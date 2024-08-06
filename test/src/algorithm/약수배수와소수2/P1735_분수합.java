package algorithm.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1735_분수합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A1 = Integer.parseInt(st.nextToken()); // 첫 번째 분수의 분자
        int B1 = Integer.parseInt(st.nextToken()); // 첫 번째 분수의 분모

        st = new StringTokenizer(br.readLine());
        int A2 = Integer.parseInt(st.nextToken()); // 두 번째 분수의 분자
        int B2 = Integer.parseInt(st.nextToken()); // 두 번째 분수의 분모

        int BSum = B1 * B2; // 공통 분모
        int A1Sum = A1 * B2; // 첫 번째 분수의 분자 합
        int A2Sum = A2 * B1; // 두 번째 분수의 분자 합

        int bunja = A1Sum + A2Sum; // 합해진 분자

        // 최대공약수 계산
        int gcdValue = gcd(bunja, BSum);

        // 최대공약수로 나누어 기약 분수로 변환
        bunja /= gcdValue;
        BSum /= gcdValue;

        System.out.println(bunja + " " + BSum);
    }

    // 최대공약수를 계산하는 메소드
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
