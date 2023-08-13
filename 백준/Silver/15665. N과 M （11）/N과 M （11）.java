import java.util.*;

public class Main
{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static boolean[] visited;
    static int[] num;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		visited = new boolean[N];
		num = new int[N];
		for(int i = 0; i < N; i++)
		    num[i] = sc.nextInt();
		Arrays.sort(num);
		dfs(0);
		System.out.print(sb);
	}
	static void dfs(int depth) {
	    if(depth == M) {
	        for(int i = 0; i < M; i++) 
	            sb.append(arr[i] + " ");
	        sb.append("\n");
	        return;
	    }
	    int before = -1;
	    for(int i = 0; i < N; i++) {
	        int now = num[i];
	        if(before != now) {
	            before = now;
	            arr[depth] = num[i];
	            dfs(depth + 1);
	        }
	    }
	}
}
