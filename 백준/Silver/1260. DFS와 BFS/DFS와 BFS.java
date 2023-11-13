import java.util.*;
import java.io.*;

public class Main
{
    static int N, M, V;
    static int arr[][];
    static boolean[] visit;
    
    static StringBuilder sb = new StringBuilder();
    static Queue<Integer> q = new LinkedList<>();
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    N = Integer.parseInt(st.nextToken());
	    M = Integer.parseInt(st.nextToken());
	    V = Integer.parseInt(st.nextToken());
	    
	    arr = new int[N+1][N+1];
	    visit = new boolean[N+1];
	    
	    for(int i = 0; i < M; i++) {
	        st = new StringTokenizer(br.readLine());
	        int x = Integer.parseInt(st.nextToken());
	        int y = Integer.parseInt(st.nextToken());
	        
	        arr[x][y] = 1;
	        arr[y][x] = 1;
	    }
	    dfs(V);
	    sb.append("\n");
	    Arrays.fill(visit, false);
	    bfs(V);
	    
	    System.out.println(sb);
	}
	
	static void dfs(int v) {
	    visit[v] = true;
	    sb.append(v).append(" ");
	    
	    for(int i = 1; i <= N; i++)
	        if(arr[v][i] == 1 && !visit[i])
	            dfs(i);
	}
	
	static void bfs(int v) {
	    q.add(v);
	    visit[v] = true;
	    
	    while(!q.isEmpty()) {
	        v = q.poll();
	        sb.append(v).append(" ");
	        
	        for(int i = 1; i <= N; i++)
	            if(arr[v][i] == 1 && !visit[i]) {
	                q.add(i);
	                visit[i] = true;
	            }
	    }
	}
}