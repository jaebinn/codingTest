package algorithm.심화1;

import java.util.Scanner;

public class P1316_그룹단어체커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // 단어의 개수를 입력받음
        int cnt = 0;  // 그룹 단어의 개수를 세기 위한 변수

        for (int i = 0; i < n; i++) {
            String str = sc.next();  // 단어를 입력받음
            boolean[] arr = new boolean[26];  // 알파벳의 등장 여부를 저장할 배열
            boolean check = true;  // 그룹 단어 여부를 체크하기 위한 변수

            for (int j = 0; j < str.length(); j++) {
                int ch = str.charAt(j) - 97;  // 현재 문자의 인덱스를 계산 ('a'의 ASCII 값이 97이므로 97을 뺌)

                if (arr[ch]) {  // 만약 현재 문자가 이미 등장한 적이 있다면
                    if (str.charAt(j) != str.charAt(j - 1)) {  // 이전 문자와 다른 경우 그룹 단어가 아님
                        check = false;
                        break;
                    }
                } else {  // 현재 문자가 처음 등장하는 경우
                    arr[ch] = true;  // 등장 여부를 true로 설정
                }
            }

            if (check) {  // 그룹 단어인 경우
                cnt++;  // 그룹 단어 개수를 증가시킴
            }
        }

        System.out.println(cnt);  // 그룹 단어의 개수를 출력
    }
}
