import java.util.*;
import static java.util.stream.Collectors.toList;
public class Main
{
    static StringBuilder sb = new StringBuilder();
    static int N; 
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    
	    for(int i = 0; i < T; i++) {
	        N = sc.nextInt();
	        dfs(1, 1, "1");
	        sb.append("\n");
	    }
	  System.out.println(sb);
	}
	
	static public void dfs(int num, int depth, String str) {
	    if(depth == N) {
	        if(cal(str) == 0) 
	            sb.append(str + "\n");
	        return;
	    }
	    
	    dfs(num + 1, depth + 1, str + " " + (num + 1));
	    dfs(num + 1, depth + 1, str + "+" + (num + 1));
	    dfs(num + 1, depth + 1, str + "-" + (num + 1));
	}
	
	static public int cal(String str) {
	    str = str.replaceAll(" ", "");
	    String num[] = str.split("[+,-]");
	    String op[] = str.replaceAll("[0-9]", "").split("");
	    
	    int sum = Integer.parseInt(num[0]);
	    int idx = 1;
	    for(int i = 0; i < op.length; i++) {
	        if(op[i].equals("+"))
	            sum += Integer.parseInt(num[idx++]);
	        else if(op[i].equals("-"))
	            sum -= Integer.parseInt(num[idx++]);
	    }
	   
	    return sum;
	}
}
