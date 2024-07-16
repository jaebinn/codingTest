package algorithm;

import java.util.Scanner;

public class P25314_코딩은체육과목입니다 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = a/4;
        String str = "long";
        String msg = "";
        for(int i=0;i<n;i++){
            msg+=str+" ";
        }
        System.out.println(msg+"int");

    }
}
