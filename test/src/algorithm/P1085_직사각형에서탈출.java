package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1085_직사각형에서탈출 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xMin = Math.min(x, w-x);
        int yMin = Math.min(y, h-y);

        if(xMin>yMin){
            System.out.println(yMin);
        }else if(xMin==yMin){
            System.out.println(xMin);
        }else if(xMin<yMin){
            System.out.println(xMin);
        }
    }
}
