import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10 {
    // n: 배열의 크기, m: 찾을 값의 개수, key: 찾을 값, result: 결과값 저장 변수
    static int n, m, key, result;
    static int[] arr; // 배열을 저장할 변수

    // 이진 탐색 함수
    private static void binarySearch(int left, int right) {
        int middle = (left + right) / 2; // 중간 인덱스 계산
        if (arr[middle] == key) { // 중간 값이 찾는 값과 같은 경우
            result = 1; // 결과를 1로 설정
            return;
        } else if (left >= right) { // 탐색 범위가 유효하지 않은 경우
            return;
        } else if (arr[middle] > key) { // 중간 값이 찾는 값보다 큰 경우
            binarySearch(left, middle - 1); // 왼쪽 부분을 탐색
        } else { // 중간 값이 찾는 값보다 작은 경우
            binarySearch(middle + 1, right); // 오른쪽 부분을 탐색
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; // 입력을 공백 단위로 나누기 위한 StringTokenizer

        // 배열의 크기 입력
        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        arr = new int[n]; // 배열 초기화

        // 배열 값 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 배열 정렬

        // 찾을 값의 개수 입력
        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        // 각 값을 이진 탐색으로 찾고 결과 출력
        for (int i = 0; i < m; i++) {
            key = Integer.parseInt(st.nextToken());
            result = 0; // 초기화
            binarySearch(0, n - 1); // 이진 탐색 호출
            System.out.println(result); // 결과 출력
        }
    }
}
