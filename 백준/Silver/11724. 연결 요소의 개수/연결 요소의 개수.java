import java.util.*;

public class Main
{
    static int N, M;
    static int graph[][];
    static boolean visited[];
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int cnt = 0;
	    
	    N = sc.nextInt();
	    M = sc.nextInt();
	    graph = new int[N+1][N+1];
	    visited = new boolean[N+1];
	    
	    for(int i = 0; i < M; i++) {
	        int x = sc.nextInt();
	        int y = sc.nextInt();
	        
	        graph[x][y] = 1;
	        graph[y][x] = 1;
	    }
	    
	    for(int i = 1; i <= N; i++)
	        if(!visited[i]) {
	            dfs(i);
	            cnt++;
	        }
	        
	    System.out.println(cnt);
	}
	
	static public void dfs(int index) {
	    if(visited[index]) return;
	    
	    visited[index] = true;
	    for(int i = 1; i <= N; i++) {
	        if(graph[index][i] == 1)
	            dfs(i);
	    }
	}
}
