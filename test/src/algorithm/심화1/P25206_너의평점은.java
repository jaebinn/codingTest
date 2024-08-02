package algorithm.심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P25206_너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[20];
        String[] gradeList = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
        double[] scoreList = {4.5,4.0,3.5,3.0,2.5,2.0,1.5,1.0,0.0,0.0};

        double totalSum = 0;
        double scoreSum = 0; //학점 총합
        for(int i=0;i<str.length;i++){
            str[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(str[i],"");
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken()); //힉점
            String grade = st.nextToken(); //등급
            for(int j=0;j<10;j++){
                if(grade.equals(gradeList[j])){
                    totalSum += score * scoreList[j];
                    if(j != 9){
                        scoreSum += score;
                    }
                }
            }
            //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
            //score(3.0) * A+(4.5) / 3.0 = 13.5 / 3.0 = 4.5
            double average = totalSum / scoreSum;
            System.out.printf("%.6f\n", average);
        }
    }
}
