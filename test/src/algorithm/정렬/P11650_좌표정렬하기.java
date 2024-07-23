package algorithm.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Coordinate> cList = new ArrayList<>();
        for(int i=0;i<N;i++){
            String[] data = br.readLine().split(" ");
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            cList.add(new Coordinate(x,y,i));
        }
        cList.sort(Comparator.comparingInt(Coordinate::getX)
                .thenComparingInt(Coordinate::getY)
                .thenComparingInt(Coordinate::getIndex)
        );
        for(Coordinate coordinate : cList){
            System.out.println(coordinate.x+" "+coordinate.y);
        }
    }
}
class Coordinate{
    int x;
    int y;
    int index;

    public Coordinate(int x, int y, int index){
        this.x = x;
        this.y = y;
        this.index = index;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getIndex(){
        return index;
    }
}