//https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
//전화번호 목록
// import java.util.Arrays;
// class Test1 {
//     public boolean solution(String[] phone_book) {
//         //1. phone_book을 정렬한다.
//         Arrays.sort(phone_book);
//         //2. 1중 loop를 돌면서 앞번호가 뒷번호의 접두어인지 확인한다.
//         for(int i=0;i<phone_book.length - 1;i++)
//             if(phone_book[i+1].startsWith(phone_book[i])) //startsWith() 함수는 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수
//                 return false;
        
//         //3. 여기까지 오지 않았다면 접두어가 없다는 것이다.

//         return true;
//     }

//     public static void main(String[] args) {
//         String[] phone_book = {"119", "97674223", "1195524421"};
//         Test1 sol = new Test1();
//         System.out.println(sol.solution(phone_book));
//     }
// }

//Hash로 풀기

import java.util.HashMap;
class Test1 {
    public boolean solution(String[] phone_book) {
        //1. HashMap을 만든다.
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<phone_book.length;i++)
            map.put(phone_book[i], i);

        //2. 모든 전화번호의 접두어가 HashMap에 있는지 확인한다.
        for(int i=0;i<phone_book.length;i++)
            for(int j=1;j<phone_book[i].length();j++)
                if(map.containsKey(phone_book[i].substring(0,j)))
                    return false;
        //3. 여기까지 왔다면 접두어가 없다는 것이다.
        
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        Test1 sol = new Test1();
        System.out.println(sol.solution(phone_book));
    }
}