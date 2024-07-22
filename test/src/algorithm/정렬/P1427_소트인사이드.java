package algorithm.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class P1427_소트인사이드 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Num = (int)(Math.log10(N)+1); //숫자 자릿수 구하는 법

        int[] arrNum = new int[Num];
        for(int i=0;i<arrNum.length;i++){
            arrNum[i] = (int)(N/(Math.pow(10,Num-1-i)))%10;
        }
        Arrays.sort(arrNum);
        for(int i=arrNum.length-1;i>=0;i--){
            System.out.print(arrNum[i]);
        }

    }
}
