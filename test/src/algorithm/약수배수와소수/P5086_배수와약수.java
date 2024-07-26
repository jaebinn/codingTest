package algorithm.약수배수와소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class P5086_배수와약수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if((A == 0) && (B == 0)){
                break;
            }
       
            if(B % A == 0){
                sb.append("factor\n");
            }
            else if(A % B == 0){
                sb.append("multiple\n");
            }
            else if((A % B !=0) && (B % A !=0)){
                sb.append("neither\n");
            }
        }
        System.out.println(sb);
    }
}
