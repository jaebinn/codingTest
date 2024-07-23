package algorithm.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class P25305_커트라인 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int[] arr = new int[A];
        for(int i=0;i<A;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // 76 85 93 98 100
        System.out.println(arr[A-B]);
    }
}
