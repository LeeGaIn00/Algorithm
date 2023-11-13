import java.util.*;
import java.io.*;

public class Main
{
    static int N;
    static int num[];
    static int op[] = new int[4];
    
    static int MAX = Integer.MIN_VALUE;
    static int MIN = Integer.MAX_VALUE;
    
    static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    N = Integer.parseInt(br.readLine());
	    num = new int[N];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < N; i++)
	        num[i] = Integer.parseInt(st.nextToken());
	        
	    st = new StringTokenizer(br.readLine());
	    
	    op[0] = Integer.parseInt(st.nextToken());
	    op[1] = Integer.parseInt(st.nextToken());
	    op[2] = Integer.parseInt(st.nextToken());
	    op[3] = Integer.parseInt(st.nextToken());
	    
	    dfs(num[0], 1);
	    
	    System.out.println(MAX);
	    System.out.println(MIN);
	}
	
	static void dfs(int res, int depth) {
	    if(depth == N) {
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