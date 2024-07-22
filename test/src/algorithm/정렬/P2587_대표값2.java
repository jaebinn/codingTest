package algorithm.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class P2587_대표값2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
