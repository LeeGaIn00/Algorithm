import java.util.*;

public class Main
{
    static int n;
    static int num[];
    static int op[] = new int[4];
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
   
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();
    	num = new int[n];
    	for(int i = 0; i < n; i++)
    	    num[i] = sc.nextInt();
    	for(int i = 0; i < 4; i++)
    	    op[i] = sc.nextInt();
    	dfs(num[0], 1);
    	System.out.println(MAX);
    	System.out.println(MIN);
	}
	static void dfs(int res, int depth) {
	    if(depth == n) {
	        MAX = Math.max(MAX, res);
	        MIN = Math.min(MIN, res);
	        return;
	    }
	    for(int i = 0; i < 4; i++) {
	        if(op[i] > 0) {
	            op[i]--;
	            if(i == 0) dfs(res + num[depth], depth + 1);
	            else if(i == 1) dfs(res - num[depth], depth + 1);
	            else if(i == 2) dfs(res * num[depth], depth + 1);
	            else dfs(res / num[depth], depth + 1);
	            op[i]++;
	        }
	    }
	}
}
