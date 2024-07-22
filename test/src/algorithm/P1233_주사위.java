package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class P1233_주사위 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); //3
        int B = Integer.parseInt(st.nextToken()); //2
        int C = Integer.parseInt(st.nextToken()); //3

        int[] A1 = new int[A];
        int[] B1 = new int[B];
        int[] C1 = new int[C];
        for(int i=0;i<A;i++){
            A1[i] = i+1;
        }
        for(int i=0;i<B;i++){
            B1[i] = i+1;
        }
        for(int i=0;i<C;i++){
            C1[i] = i+1;
        }
        List<Integer> numList = new ArrayList<Integer>();
        for(int i=0;i<A;i++){
            for(int j=0;j<B;j++){
                for(int k=0;k<C;k++){
                    numList.add(A1[i]+B1[j]+C1[k]);
                }
            }
        }
        Set<Integer> set = new HashSet<>(numList);
        int mostFrequentNumber = -1;
        int highestFrequency = 0;

        for (int num : set) {
            int frequency = Collections.frequency(numList, num);
            if (frequency > highestFrequency) {
                highestFrequency = frequency;
                mostFrequentNumber = num;
            }
        }

        System.out.println(mostFrequentNumber);
    }
}
