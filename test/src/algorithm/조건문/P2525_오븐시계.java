package algorithm.조건문;

import java.util.Scanner;

public class P2525_오븐시계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String times = sc.nextLine();
        String[] time = times.split(" ");

        int a = Integer.parseInt(time[0]);
        int b = Integer.parseInt(time[1]);

        int needTime = sc.nextInt();

        int min = 60*a+b; //시 -> 분
        min += needTime;

        int hour = (min/60) % 24;
        int minute = min%60;

        System.out.println(hour + " " + minute);



    }
}
