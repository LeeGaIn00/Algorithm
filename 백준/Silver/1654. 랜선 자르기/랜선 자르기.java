import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    StringBuilder sb = new StringBuilder();
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int K = Integer.parseInt(st.nextToken());
	    int N = Integer.parseInt(st.nextToken());
	    int arr[] = new int[K];
	    
	    long max = 0;
	    
	    for(int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(max < arr[i]) max = arr[i];
	    }
	    
	    max++;
	    
	    long min = 0;
	    
	    while(min < max) {
	        long mid = (max + min) / 2;
	        
	        int cnt = 0;
	        
	        for(int i : arr) 
	            cnt += (i / mid);
	            
	        if(cnt < N) max = mid;
	        else min = mid + 1;
	    }
	    
	    System.out.println(min - 1);
	}
	
}
