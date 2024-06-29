//https://school.programmers.co.kr/learn/courses/30/lessons/42576 
//완주하지 못한 선수
// import java.util.Arrays;
// public class Solution{
//     public String solution(String[] participant, String[] completion){
//         String answer = "";
//         //1. 두 배열을 정렬한다.
//         Arrays.sort(participant);
//         Arrays.sort(completion);

//         //2. 두 배열이 다를 떄까지 찾는다.
//         int i=0;
//         for(;i<completion.length;i++){
//             if(!participant[i].equals(completion[i])){
//                 break;
//             }
//         }
//         //3. 여기까지 왔다면, 마지막 주자가 완주하지 못한 선수다.
//         return participant[i];
//     }

//     public static void main(String[] args){
//         String[] part = {"leo", "kiki", "eden"};
//         String[] comp = {"eden", "kiki"};
//         Solution sol = new Solution();
//         System.out.println(sol.solution(part, comp));
//     }
// }

//Hash로 풀기
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Solution{
    public String solution(String[] participant, String[] completion){
        String answer = "";
        //1. Hash map을 만든다 (participant)
        HashMap<String,Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player, map.getOrDefault(player, 0)+1);
        
        System.out.println(map);
        //2. Hash map을 뺀다 (completion)
        for(String player : completion)
            map.put(player, map.get(player) - 1);
        
        //3. value가 0이 아닌 마지막 주자를 찾는다.
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0){
                answer  = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution sol = new Solution();
        System.out.println(sol.solution(part, comp));
    }
}