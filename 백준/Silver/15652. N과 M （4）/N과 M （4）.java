import java.util.*;

public class Main
{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visited;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		visited = new boolean[N];
		dfs(0, 0);
		System.out.print(sb);
	}
	static void dfs(int depth, int a) {
	    if(depth == M) {
	        for(int val : arr) 
	            sb.append(val + " ");
	        sb.append("\n");
	        return;
	    }
	    for(int i = a; i < N; i++) {
	        arr[depth] = i + 1;
	        dfs(depth + 1, i);
	    }
	}
}
