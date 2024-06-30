//https://school.programmers.co.kr/learn/courses/30/lessons/42578
//의상 문제
import java.util.HashMap;
import java.util.Iterator;
public class Test2 {
    public int solution(String[][] clothes){
        //1. 옷을 종류별로 구분한다.
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] cloth : clothes){
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        //2. 입지 않은 경우를 추가해서 모든 조합을 계산한다.
        Iterator<Integer> iter = map.values().iterator();
        int answer = 1;

        while(iter.hasNext())
            answer *= iter.next().intValue()+1;
        
        //3. 아무 종류의 옷도 입지 않은 경우 제외한다.
        return answer - 1;
    }
    public static void main(String[] args) {
        Test2 sol = new Test2();
        String[][] clothes = {
            {"yellowhat","headgear"},
            {"bluesunglasses", "eyegear"},
            {"green_turban", "headgear"}
        };
        System.out.println(sol.solution(clothes));
    }
}
