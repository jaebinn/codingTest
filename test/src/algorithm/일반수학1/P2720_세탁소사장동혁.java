package algorithm.일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2720_세탁소사장동혁 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            sb.append(C / Quarter + " ");
            C %= Quarter;

            sb.append(C / Dime + " ");
            C %= Dime;

            sb.append(C / Nickel + " ");
            C %= Nickel;

            sb.append(C / Penny + "\n");
        }
        System.out.print(sb);

        br.close();
    }
}
