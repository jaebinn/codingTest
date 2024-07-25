package algorithm;

import java.util.Scanner;
import java.util.Stack;

public class P1874_스택수열 {
    public static void main(String[] args) {
        // 입력을 받기 위해 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 입력받을 수열의 크기 N을 받음
        int N = sc.nextInt();
        
        // 수열을 저장할 배열 A를 선언하고 입력받은 값으로 초기화
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        
        // 스택을 사용하여 수열을 생성할 수 있는지 확인
        Stack<Integer> stack = new Stack<>();
        int num = 1; // 스택에 넣을 다음 숫자
        boolean result = true; // 결과를 저장할 변수
        StringBuffer bf = new StringBuffer(); // 출력 결과를 저장할 StringBuffer
        
        // 입력받은 수열 A를 순회
        for(int i = 0; i < A.length; i++){
            int su = A[i]; // 현재 수열의 값을 가져옴
            
            // 현재 수열의 값이 num보다 크거나 같으면
            if(su >= num){
                // num이 현재 수열의 값이 될 때까지 스택에 숫자를 넣음
                while(su >= num){
                    stack.push(num++);
                    bf.append("+\n"); // push 연산 기록
                }
                // 스택에서 값을 꺼냄
                stack.pop();
                bf.append("-\n"); // pop 연산 기록
            }else{
                // 스택에서 값을 꺼냄
                int n = stack.pop();
                // 스택에서 꺼낸 값이 현재 수열의 값보다 크면 수열을 만들 수 없음
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    bf.append("-\n"); // pop 연산 기록
                }
            }
        }
        
        // 수열을 만들 수 있으면 결과 출력
        if(result) System.out.println(bf.toString());
    }
}
