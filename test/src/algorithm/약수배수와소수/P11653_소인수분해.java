package algorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11653_소인수분해 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=2;i<=Math.sqrt(N);i++){
            while(N%i == 0){
                sb.append(i).append("\n");
                N/=i;
            }
        }
        if(N != 1){
            sb.append(N);
        }
        System.out.println(sb);
    }
}
