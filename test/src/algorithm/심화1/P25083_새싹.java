package algorithm.심화1;

public class P25083_새싹 {
    public static void main(String[] args) {
        String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
				   "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
				   " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
				   "   `~\\/\n" + 			// \\, \n 이 제어문자다.
				   "      |\n" + 			// \n 이 제어문자다.
				   "      |";
 
		System.out.print(s);
    }
}
