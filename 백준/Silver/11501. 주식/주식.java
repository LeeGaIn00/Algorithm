import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   
	    int T = Integer.parseInt(br.readLine());
	    
	    for(int i = 0; i < T; i++) {
	        int N = Integer.parseInt(br.readLine());
	        int arr[] = new int[N];
	        long ans = 0;
	        
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        for(int j = 0; j < N; j++) 
	            arr[j] = Integer.parseInt(st.nextToken());
	       
	        long max = 0;
	        for(int j = N - 1; j >= 0; j--) {
	            if(max < arr[j]) 
	                max = arr[j];
	            else 
	                ans += (max - arr[j]);
	        }
	            
	        System.out.println(ans);
	    }
	  
	}
}