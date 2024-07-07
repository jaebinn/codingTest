package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 빠르게 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 입력 줄에서 공백을 기준으로 숫자를 분리
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 첫 번째 숫자는 배열의 요소 개수(suNo), 두 번째 숫자는 질의 개수(quizNo)
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        // 합 배열(S) 선언, 길이는 suNo+1로 설정하여 1-based 인덱싱
        long[] S = new long[suNo + 1];
        
        // 두 번째 입력 줄에서 공백을 기준으로 숫자를 분리
        st = new StringTokenizer(br.readLine());
        
        // 배열 요소를 읽고, 합 배열을 구성
        for (int i = 1; i <= suNo; i++) {
            // 현재까지의 합을 저장
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        
        // 각 질의에 대해 구간 합을 계산하고 출력
        for (int q = 0; q < quizNo; q++) {
            // 질의에서 시작 인덱스(i)와 끝 인덱스(j)를 읽음
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            // 구간 합을 계산하여 출력
            System.out.println(S[j] - S[i - 1]);
        }
    }
}