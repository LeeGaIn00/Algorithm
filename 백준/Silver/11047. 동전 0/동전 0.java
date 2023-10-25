import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int cnt = 0;
	    
	    int N = Integer.parseInt(st.nextToken());
	    int K = Integer.parseInt(st.nextToken());
	    int arr[] = new int[N];
	    
	    for(int i = 0; i < N; i++) 
	        arr[i] = Integer.parseInt(br.readLine());
	    
	    for(int i = N - 1; i >= 0; i--) {
	        if(K / arr[i] > 0) {
	            cnt += (K / arr[i]);
	            K %= arr[i];
	        }
	        
	        if(K == 0) break; 
	    }
	            
	    System.out.println(cnt);
	}
}