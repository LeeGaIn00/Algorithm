import java.util.*;

public class Main
{
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] arr;
    static int[] num;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
		num = new int[N];
		for(int i = 0; i < N; i++)
		    num[i] = sc.nextInt();
		Arrays.sort(num);
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
	        arr[depth] = num[i];
	        dfs(depth + 1, i + 1);
	    }
	}
}
