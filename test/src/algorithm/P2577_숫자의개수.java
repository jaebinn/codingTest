package algorithm;

import java.util.Scanner;

public class P2577_숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();

        String str = Integer.toString(N1*N2*N3);
        
        for(int i=0;i<10;i++){
            int cnt = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)-'0' == i){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }

    }
    
}
