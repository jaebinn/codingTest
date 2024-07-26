package algorithm.약수배수와소수;

import java.util.Scanner;
import java.util.ArrayList;

public class P9506_약수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            if (N == -1) {
                break;
            }
            
            ArrayList<Integer> divisors = new ArrayList<>();
            int sum = 0;
            
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    divisors.add(i);
                    sum += i;
                }
            }
            
            if (sum == N) {
                System.out.print(N + " = ");
                for (int i = 0; i < divisors.size(); i++) {
                    if (i == divisors.size() - 1) {
                        System.out.print(divisors.get(i));
                    } else {
                        System.out.print(divisors.get(i) + " + ");
                    }
                }
                System.out.println();
            } else {
                System.out.println(N + " is NOT perfect.");
            }
        }
    }
}
