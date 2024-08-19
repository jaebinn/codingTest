package algorithm.이차원배열;

import java.util.Scanner;

public class P2563_색종이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int N = sc.nextInt();

        for(int i=0;i<N;i++){
            int a = sc.nextInt(); //열가로
            int b = sc.nextInt(); //행가로
            for(int j=a;j<a+10;j++){
                //사각형부분에 1넣어주기
                for(int k=b;k<b+10;k++){
                    arr[k][j] = 1;
                }
            }
        }
        //2차원 배열 출력, 1인 숫자만 더하기
        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j] == 1) {
                    result += arr[i][j];
                }
            }
        }
        System.out.println(result);

    }
}
