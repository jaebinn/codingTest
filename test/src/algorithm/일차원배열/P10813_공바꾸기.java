package algorithm.일차원배열;

import java.util.Scanner;

public class P10813_공바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N+1];

        //배열초기화
        for(int index=1;index<=N;index++){
            arr[index] = index; //인덱스마다 1, 2, 3, 4, 5 넣기
        }
        for(int index=1;index<=M;index++){
            int i = sc.nextInt(); //인덱스 i
            int j = sc.nextInt(); //인덱스 j
            int temp=0;
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        for(int k=1;k<=N;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
