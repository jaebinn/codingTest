package algorithm.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class P10814_나이순정렬 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Member> memberList = new ArrayList<>();
        for(int i=0;i<N;i++){
            String[] memberData = br.readLine().split(" ");
            int age = Integer.parseInt(memberData[0]);
            String name = memberData[1];
            memberList.add(new Member(age, name, i));
        }
        // 나이 순으로 오름차순 정렬
        // 나이가 같을 경우에는 입력된 순서(index)대로 정렬
        memberList.sort(Comparator.comparingInt(Member::getAge)
                .thenComparingInt(Member::getIndex));
        for(Member member : memberList){
            System.out.println(member.age+" "+member.name);
        }
    }
}
class Member {
    int age;
    String name;
    int index;

    public Member(int age, String name, int index) {
        this.age = age;
        this.name = name;
        this.index = index;
    }

    public int getAge() {
        return age;
    }

    public int getIndex() {
        return index;
    }
}

