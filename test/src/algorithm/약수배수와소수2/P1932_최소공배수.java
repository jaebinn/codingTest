package algorithm.약수배수와소수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class P1932_최소공배수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            String inputLine = br.readLine();
            StringTokenizer st = new StringTokenizer(inputLine, " ");
            try {
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                if (A == 1) {
                    System.out.println(B);
                } else if (B == 1) {
                    System.out.println(A);
                } else {
                    int lcm = lcm(A, B);
                    System.out.println(lcm);
                }
            } catch (NoSuchElementException e) {
                System.err.println("입력이 올바르지 않습니다: " + inputLine);
            }
        }
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
