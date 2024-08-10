package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.*;

public class P2609_최대공약수와최소공배수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(gcd(A,B));
        System.out.println(A*B/gcd(A,B));

    }
    // 최대공약수 반복문 방식
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b; // 나머지를 구해준다.
 
			// GCD(a, b) = GCD(b, r)이므로 변환한다.
			a = b;
			b = r;
		}
		return a;
	}

}
