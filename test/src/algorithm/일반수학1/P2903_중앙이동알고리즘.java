package algorithm.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2903_중앙이동알고리즘 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        System.out.println((int)Math.pow(Math.pow(2, n) +1, 2));
    }
}
