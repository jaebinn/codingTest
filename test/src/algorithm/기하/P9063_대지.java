package algorithm.기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P9063_대지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] X = new int[N]; //x좌표
        int[] Y = new int[N]; //y좌표
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        //x좌표에서 가장 큰값과 작은값 차이구하기
        int Xmax=X[N-1];
        int Xmin=X[0];
        int x = Xmax - Xmin;

        //y좌표에서 가장 큰값과 작은값 차이구하기
        int Ymax=Y[N-1];
        int Ymin=Y[0];
        int y = Ymax - Ymin;

        System.out.println(x*y);
    }
}
