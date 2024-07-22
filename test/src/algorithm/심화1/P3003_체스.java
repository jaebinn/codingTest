package algorithm.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P3003_체스 {
    public static void main(String[] args) throws IOException{
        int[] chess = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

        int[] mychess = {king, queen, rook, bishop, knight, pawn};
        List<Integer> need = new ArrayList<>();
        for(int i=0;i<6;i++){
            need.add(chess[i]-mychess[i]);
        }
        for(int i=0;i<need.size();i++){
            System.out.print(need.get(i)+" ");
        }
    }
}
