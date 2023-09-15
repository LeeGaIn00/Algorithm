import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    StringBuilder sb = new StringBuilder();
	    
	    for(int i = 0; i < T; i++) {
	        int N = sc.nextInt();
	        int ans = sum(N);
	        
	        if(ans == N) sb.append("Perfect");
	        else if(ans < N) sb.append("Deficient");
	        else sb.append("Abundant");
	        sb.append("\n");
	    }
	    System.out.println(sb);
	}
	
	static public int sum(int n) {
	    int res = 0;
	    
	    for(int i = 1; i * i <= n; i++) {
	        if(i * i == n) res += i;
	        else if(n % i == 0) {
	            res += i;
	            res += n/i;
	        }
	    }
	    return res-n;
	} 
}
