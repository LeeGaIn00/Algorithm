import java.util.*;
import java.io.*;

public class Main
{
    
    static int N, M;
    static int arr[][];
    static int visited[];
    static int min = Integer.MAX_VALUE;
    
    static int[] ydir = {-1, 0, 1};
    
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] temp = br.readLine().split(" ");
	    
	    N = Integer.parseInt(temp[0]);
	    M = Integer.parseInt(temp[1]);
	    arr = new int[N][M];
	    
	    for(int i = 0; i < N; i++) {
	        temp = br.readLine().split(" ");
	        
	        for(int j = 0; j < M; j++)
	            arr[i][j] = Integer.parseInt(temp[j]);
	    }
	    
	    for(int i = 0; i < M; i++) {
	        visited = new int[N];
	        visited[0] = i;
	        dfs(1, i, -1);
	    }
	   
	    System.out.println(min);
	}
	
	public static void dfs(int depth, int y, int dir) {
	    if(depth == N) {
	        int sum = arr[0][visited[0]];
	        
	        for(int i = 1; i < N; i++)
	            sum += arr[i][visited[i]];
	            
	        min = min > sum ? sum : min;
	        return;
	    }
	    
	    for(int i = 0; i < 3; i++) {
	        int dy = y + ydir[i];
	        
	        if((dy >= 0 && dy < M) && dir != i) {
	            visited[depth] = dy;
	            dfs(depth + 1, dy, i);
	        }
	    }
	}
}
