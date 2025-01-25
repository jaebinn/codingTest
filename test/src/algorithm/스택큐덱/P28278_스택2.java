package algorithm.스택큐덱;

import java.util.Stack;
import java.util.Scanner;


/*
 *  1 X: 정수 X를 스택에 넣는다. (1 ≤ X ≤ 100,000)
    2: 스택에 정수가 있다면 맨 위의 정수를 빼고 출력한다. 없다면 -1을 대신 출력한다.
    3: 스택에 들어있는 정수의 개수를 출력한다.
    4: 스택이 비어있으면 1, 아니면 0을 출력한다.
    5: 스택에 정수가 있다면 맨 위의 정수를 출력한다. 없다면 -1을 대신 출력한다.
 * 
 */
public class P28278_스택2 {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            Stack<Integer> stack = new Stack<>();
    
            int N = scanner.nextInt();
            for(int i = 0; i < N; i++) {
                int n = scanner.nextInt();
                switch (n) {
                    case 1:
                        stack.push(scanner.nextInt()); 
                        break;
                    case 2:
                        sb.append((stack.isEmpty()?-1:stack.pop())+"\n"); 
                        break;
                    case 3:
                        sb.append(stack.size()+"\n"); 
                        break;
                    case 4:
                        sb.append((stack.isEmpty()?1:0)+"\n"); 
                        break;
                    case 5:
                        sb.append((stack.isEmpty()?-1:stack.peek())+"\n");
                }
            }
            System.out.println(sb.toString());
        }

}
