package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P26069_붙임성좋은총총이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        HashSet<String> hSet = new HashSet<>();
        StringTokenizer st;
        hSet.add("ChongChong");
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            String p1 = st.nextToken();
            String p2 = st.nextToken();

            if(hSet.contains(p1) || hSet.contains(p2)) {
                hSet.add(p1);
                hSet.add(p2);
            }
        }
        System.out.println(hSet.size());

    }
}
