package algorithm.심화1;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P1157_단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] txt = str.toCharArray();
        List<Character> arrList = new ArrayList<>();
        for(int i=0;i<txt.length;i++){
            arrList.add(txt[i]);
        }
        List<Character> UppercaseList = arrList.stream()
                .map(c -> (c >= 'a' && c <= 'z') ? (char) (c - 32) : c)
                .collect(Collectors.toList());

        Set<Character> freqSet = new HashSet<Character>(UppercaseList);

        Character mostFrequentChar = null;
        int maxFrequency = 0;
        boolean isDuplicate = false;

        for (Character word : freqSet) {
            int frequency = Collections.frequency(UppercaseList, word);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentChar = word;
                isDuplicate = false; // 새로운 최대 빈도수 문자가 발견된 경우
            } else if (frequency == maxFrequency) {
                isDuplicate = true; // 동일한 최대 빈도수 문자가 또 발견된 경우
            }
        }

        if (isDuplicate) {
            System.out.println("?");
        } else {
            System.out.println(mostFrequentChar);
        }
    }
}
