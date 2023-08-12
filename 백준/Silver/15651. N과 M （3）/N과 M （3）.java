import java.util.*;

public class Main
{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		dfs(0);
		System.out.print(sb);
	}
	static void dfs(int depth) {
	    if(depth == M) {
	        for(int val : arr) 
	            sb.append(val + " ");
	        sb.append("\n");
	        return;
	    }
	    for(int i = 0; i < N; i++) {
	        arr[depth] = i + 1;
	        dfs(depth + 1);
	    }
	}
}
