package algorithm.심화1;

import java.util.Scanner;

public class P2941_크로아티아알파벳 {
    public static void main(String[] args) {
        String[] croatiaTxt = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0;i<croatiaTxt.length;i++){
            if(str.contains(croatiaTxt[i]))
                str = str.replace(croatiaTxt[i],"O");
        }
        System.out.println(str.length());
        
    }
}
