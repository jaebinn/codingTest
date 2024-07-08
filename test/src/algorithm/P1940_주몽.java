package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄에서 N (재료의 개수)을 읽어옴
        int N = Integer.parseInt(br.readLine());
        
        // 두 번째 줄에서 M (갑옷을 만드는데 필요한 수)을 읽어옴
        int M = Integer.parseInt(br.readLine());

        // 재료의 개수를 저장할 배열 A 생성
        int[] A = new int[N];
        
        // 세 번째 줄에서 재료의 숫자들을 읽어옴
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        // 배열을 정렬
        Arrays.sort(A);

        // 쌍의 개수를 세기 위한 변수 count 초기화
        int count = 0;
        
        // 투 포인터 설정: i는 배열의 시작, j는 배열의 끝
        int i = 0; // A[0] -> 최소값
        int j = N - 1; // A[N-1] -> 최대값

        // 두 포인터가 서로 교차할 때까지 반복
        while (i < j) {
            // 두 포인터가 가리키는 값의 합이 M보다 작으면 i 증가
            if (A[i] + A[j] < M) {
                i++;
            } 
            // 두 포인터가 가리키는 값의 합이 M보다 크면 j 감소
            else if (A[i] + A[j] > M) {
                j--;
            } 
            // 두 포인터가 가리키는 값의 합이 M과 같으면 count 증가, i와 j를 각각 증가, 감소
            else {
                count++;
                i++;
                j--;
            }
        }
        
        // 최종적으로 찾은 쌍의 개수를 출력
        System.out.println(count);
    }
}
