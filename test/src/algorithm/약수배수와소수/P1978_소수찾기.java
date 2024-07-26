package algorithm.약수배수와소수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P1978_소수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> arrList = new ArrayList<>();
        for(int i=0;i<N;i++){
            int A = sc.nextInt();
            arrList.add(A);
        }
        int sum = 0;
        for (int num : arrList) {
            if (isPrime(num)) {
                sum++;
            }
        }
        
        System.out.println(sum);
    }

    private static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
