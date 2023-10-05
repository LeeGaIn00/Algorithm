import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    st = new StringTokenizer(br.readLine());
	    
	    int arr[] = new int[N];
	    int max = 0;
	    for(int i = 0; i < N; i++) {
	        arr[i] = Integer.parseInt(st.nextToken());
	        if(max < arr[i]) max = arr[i];
	    }
	    
	    int min = 0;
	    while(min < max) {
	        int mid = (min + max) / 2;
	        long total = 0;
	        
	        for(int i = 0; i < N; i++) 
	            if(arr[i] - mid > 0)
	                total += (arr[i] - mid);
	        
	        if(total < M)
	            max = mid;
	        else 
	            min = mid + 1;
	    }
	    
	    System.out.println(min - 1);
	}
	
}
