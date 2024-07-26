package algorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2501_약수구하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int count = 0;
        
        for(int i = 1; i <= A; i++) {
            if(A % i == 0) {
                count++;
            }
            if(count == B) {
                System.out.println(i);
                return; //프로그램 종료
            }
        }
        
        // B번째 약수가 존재하지 않으면 0을 출력
        System.out.println(0);
    }
}
