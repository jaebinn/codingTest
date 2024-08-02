package algorithm.이차원배열;

import java.util.Scanner;

public class P2566_최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = Integer.MIN_VALUE; // 최댓값 초기화
        int maxRow = 0;
        int maxCol = 0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    maxRow = i+1;
                    maxCol = j+1;
                } 
            }
        }
        System.out.println(max);
        System.out.println(maxRow+" "+maxCol);
    }
}
