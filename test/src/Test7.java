//세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test7 {
    public static void main(String[] args) throws IOException{
        //BufferedReader클래스는 Scanner와 유사
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클래스
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];
        arr[0] = Integer.parseInt(st.nextToken()); //첫번째 호출
        arr[1] = Integer.parseInt(st.nextToken()); //두번째 호출
        arr[2] = Integer.parseInt(st.nextToken()); //세번째 호출

        //정렬
        Arrays.sort(arr);

        System.out.println(arr[1]);
    }
}
