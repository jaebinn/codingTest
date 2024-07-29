package algorithm.재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P27433_팩토리얼2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(factorial(N));
    }

    public static long factorial(int num){
        if(num<=0){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
