package algorithm.일차원배열;

import java.util.Scanner;

public class P10811_바구니바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int A[] = new int[N+1];
        for(int i=1;i<=N;i++){
            A[i] = i;
        }
        
        for(int i=0;i<M;i++){
            int S = sc.nextInt();
            int E = sc.nextInt();
            int[] temp = new int[E-S+1];
            int index = 0;
            for(int j=E;j>=S;j--){
                temp[index++] = A[j];
            }
            index = 0;
            for(int j=S;j<=E;j++){
                A[j] = temp[index++];
            }
        }

        for(int i=1;i<=N;i++){
            System.out.print(A[i]+" ");
        }
    }
}
