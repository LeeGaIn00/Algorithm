import java.util.*;

public class Main
{
    static int arr[];
    static int N; 
    static int M;
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    N = sc.nextInt();
	    M = sc.nextInt();
	    arr = new int[M];
        dfs(0, 1);
	}
	static void dfs(int depth, int a) {
	    if(depth == M) {
	        for(int val : arr)
	            System.out.print(val + " ");
	        System.out.println();
	        return;
	    }
	    for(int i = a; i <= N; i++) {
	        arr[depth] = i;
	        dfs(depth + 1, i + 1);
	    }
	}
}
