package algorithm.심화1;

import java.util.Scanner;

public class P1316_그룹단어체커 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for(int i=0;i<n;i++){
            String str = sc.next();
            boolean[] arr = new boolean[26];
            boolean check = true;

            for(int j=0;j<str.length();j++){
                int ch = str.charAt(j) - 97;
                if(arr[ch]){
                    if(str.charAt(j) != str.charAt(j - 1)){
                        check = false;
                        break;
                    }
                }
                else{
                    arr[ch] = true;
                }
            }
            if(check){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
