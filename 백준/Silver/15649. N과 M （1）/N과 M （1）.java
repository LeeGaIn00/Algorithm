import java.util.*;

public class Main
{
    static int arr[];
    static boolean visited[];
    static int N; 
    static int M;
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
	    arr = new int[M];
	    visited = new boolean[N+1];
        dfs(0);
	}
	static void dfs(int depth) {
	    if(depth == M) {
	        for(int val : arr)
	            System.out.print(val + " ");
	        System.out.println();
	        return;
	    }
	    for(int i = 0; i < N; i++) {
	        if(!visited[i]) {
	            visited[i] = true;
	            arr[depth] = i + 1;
	            dfs(depth + 1);
	            visited[i] = false;
	        }
	    }
	}
}
