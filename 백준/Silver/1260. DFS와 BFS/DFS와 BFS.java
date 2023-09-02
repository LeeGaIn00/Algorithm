import java.util.*;
import java.io.*;

public class Main
{
    static int graph[][];
    static boolean[] visited;
    static int n, m, v;
    
    static Queue<Integer> queue = new LinkedList<>();
	static StringBuilder sb = new StringBuilder();
    
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s = br.readLine();
	    StringTokenizer st = new StringTokenizer(s);
	    
	    n = Integer.parseInt(st.nextToken());
	    m = Integer.parseInt(st.nextToken());
	    v = Integer.parseInt(st.nextToken());
	    graph = new int[n+1][n+1];
	    visited = new boolean[n+1];
	    
	    for(int i = 0; i < m; i++) {
	        st = new StringTokenizer(br.readLine());
	        int node1 = Integer.parseInt(st.nextToken());
	        int node2 = Integer.parseInt(st.nextToken());
	        
	        // 양방향 그래프
	        graph[node1][node2] = 1;
	        graph[node2][node1] = 1;
	    }
	    dfs(v);
	    sb.append("\n");
	    Arrays.fill(visited, false); // 방문배열 초기화
	    
	    bfs(v);
        System.out.println(sb);
    }
    
    static void dfs(int v) {
        visited[v] = true;
        sb.append(v).append(" ");
        
        // recursive
        for(int i = 1; i <= n; i++) {
            if(graph[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }
    
    static void bfs(int v) {
        queue.add(v);
        visited[v] = true;
        
        while(!queue.isEmpty()) {
            v = queue.poll();
            sb.append(v).append(" ");
            
            for(int i = 1; i <= n; i++) {
                if(graph[v][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
