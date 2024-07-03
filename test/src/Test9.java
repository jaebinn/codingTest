//ATM
import java.util.Arrays;
import java.util.Scanner;

public class Test9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int prev = 0; //이전까지의 대기시간 누적합
        int sum = 0; //사람별 대기시간 총합
        for(int i=0;i<N;i++){
            sum += prev + arr[i];

            prev += arr[i];
        }
        System.out.println(sum);
    }
    
}
