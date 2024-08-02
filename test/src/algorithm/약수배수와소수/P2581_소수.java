package algorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2581_소수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
        
        int min = M;
        int totalSum = 0;
        for(int i=N;i<=M;i++){ 
            boolean check = true;
            if(i==1) check = false;
            for(int j=2;j<i;j++){
                //나누어 떨어진다면 check에 false 저장하고 반복 종료
                if(i%j==0){
                    check = false;
                    break;
                }

            }
            //check가 true라면 실수이니 합하고, 최솟값 저장.
            if(check){
                if(min > i) min = i;
                totalSum += i;
            }
        }
        if(totalSum == 0){
            System.out.println(-1);
        }else{
            System.out.println(totalSum + "\n" + min);
        }
        
    }
}
