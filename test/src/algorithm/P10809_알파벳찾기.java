package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P10809_알파벳찾기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] text = br.readLine().toCharArray(); // text: [b,a,e,k,j,o,o,n]

        for(int i=0;i<26;i++){
            int temp = -1;
            for(int j=0;j<text.length;j++){
                if(text[j] - 'a' == i){ //알파벳과 현재 텍스트 자리가 매칭
                    temp = j;
                    break;
                }
            }
            System.out.print(temp+" ");
        }
    }
}
