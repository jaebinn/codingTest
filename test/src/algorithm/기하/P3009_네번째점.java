package algorithm.기하;

import java.util.Scanner;
public class P3009_네번째점 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coordinate1 = {sc.nextInt(), sc.nextInt()};
        int[] coordinate2 = {sc.nextInt(), sc.nextInt()};
        int[] coordinate3 = {sc.nextInt(), sc.nextInt()};

        int x,y;

        //x좌표 비교
        if(coordinate1[0] == coordinate2[0]){
            x = coordinate3[0];
        }
        else if(coordinate1[0] == coordinate3[0]){
            x = coordinate2[0];
        }
        else{
            x = coordinate1[0];
        }
        
        //y좌표 비교
        if(coordinate1[1] == coordinate2[1]){
            y = coordinate3[1];
        }
        else if(coordinate1[1] == coordinate3[1]){
            y = coordinate2[1];
        }
        else{
            y = coordinate1[1];
        }

        System.out.println(x+" "+y);
        
    }
}
