import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Test8 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] list = new String[N];
        for(int i=0;i<N;i++)
            list[i] = br.readLine();
        //정렬 및 Comparator 인터페이스를 구현하여 비교 기준을 설정
        Arrays.sort(list, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length())
                    return o1.compareTo(o2); //o1의 값에서 o2의 값을 뺀 수
                else
                    return o1.length() - o2.length(); //o1의 길이에서 o2의 길이를 뺸 수
            }
        });
        //중복 제거하고 출력
        for(int i=0;i<N;i++){
            if(i!=0){
                if(list[i].compareTo(list[i-1])!=0){
                    System.out.println(list[i]);
                }
            }else{
                System.out.println(list[i]);
            }
        }
    }
}
