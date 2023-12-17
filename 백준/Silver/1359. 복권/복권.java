import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    int K = Integer.parseInt(st.nextToken());
	   
	    double res = 0;
	    double p = combination(N, M);
	    while(M >= K) {
	        if(N - M < M - K) {
	            K++;
	            continue;
	        }
	        
	        double c = combination(M, K) * combination(N- M, M- K);
	        res += c / p;
	        K++;
	    } 
	   
	    System.out.printf("%.16f", res); 
	}
	
	static long combination(int n, int r) {
	    int p = 1;
	    int c = 1;
	    
	    while(r > 0) {
	        c *= n;
	        p *= r;
	        
	        n--;
	        r--;
	    }
	    return c / p;
	}
}