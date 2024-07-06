package algorithm;

import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        //문자열을 문자 배열로 변환
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0;i<cNum.length;i++){
            //문자 '0'의 유니코드 값을 빼서 해당 문자의 정수 값을 얻음
            sum += cNum[i] - '0';
        }
        System.out.println(sum);

    }
}
