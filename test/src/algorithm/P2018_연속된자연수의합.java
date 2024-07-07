package algorithm;

import java.util.Scanner;

public class P2018_연속된자연수의합 {
    public static void main(String[] args) {
        // Scanner 객체를 사용하여 입력 값을 받음
        Scanner sc = new Scanner(System.in);
        // 입력받은 자연수 N
        int N = sc.nextInt();
        
        // 연속된 자연수의 합이 N이 되는 경우의 수를 저장하는 변수
        int count = 1;
        // 시작 인덱스와 끝 인덱스, 그리고 현재 합을 저장하는 변수들
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        // 끝 인덱스가 N에 도달할 때까지 반복
        while (end_index != N) {
            // 현재 합이 N과 같으면
            if (sum == N) {
                // 경우의 수를 증가시키고, 끝 인덱스를 증가시키며 새로운 수를 합에 더함
                count++;
                end_index++;
                sum += end_index;
            } 
            // 현재 합이 N보다 크면
            else if (sum > N) {
                // 시작 인덱스를 증가시키며 시작 인덱스에 해당하는 값을 합에서 뺌
                sum -= start_index;
                start_index++;
            } 
            // 현재 합이 N보다 작으면
            else {
                // 끝 인덱스를 증가시키며 새로운 수를 합에 더함
                end_index++;
                sum += end_index;
            }
        }
        // 결과 출력
        System.out.println(count);
    }
}
