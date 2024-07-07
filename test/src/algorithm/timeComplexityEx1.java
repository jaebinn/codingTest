package algorithm;

public class TimeComplexityEx1 {
    public static void main(String[] args) {
        //1~100 사이 값 랜덤 선택
        int findNumber = (int)(Math.random()*100)+1;
        System.out.println(findNumber);
        for(int i=0;i<100;i++){
            if(i == findNumber){
                System.out.println(i);
            }
        }
    }
}
