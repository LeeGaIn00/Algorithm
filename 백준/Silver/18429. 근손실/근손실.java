import java.util.*;

public class Main
{
    
    static boolean visited[];
    static int N, K;
    static int arr[];
    static int cnt = 0;
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    N = sc.nextInt();
	    K = sc.nextInt();
	    arr = new int[N];
	    visited = new boolean[N];
	    
	    for(int i = 0; i < N; i++)
	        arr[i] = sc.nextInt();
	    
	    dfs(500, 0);
	    
		System.out.println(cnt);
	}
	
	static public void dfs(int w, int depth) {
	    if(w < 500) return;
	    if(depth == N) {
	        cnt++;
	        return;
	    }
	    
	    for(int i = 0; i < N; i++) {
	        if(!visited[i]) {
	            visited[i] = true;
	            dfs(w - K + arr[i], depth + 1);
	            visited[i] = false;
	        }
	    }
	}
}
