import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int M = Integer.parseInt(br.readLine());
	    int arr[] = new int[M];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < M; i++)
	        arr[i] = Integer.parseInt(st.nextToken());
	   
	    int start = 1;
	    int end = N;
	    int result = 0;
	    while(start <= end) {
	        int mid = (start + end) / 2;
	        boolean flag = true;
	        
	        int point = 0;
	        for(int i = 0; i < arr.length; i++) {
	            if(arr[i] - mid <= point)
	                point = arr[i] + mid;
	            else
	                flag = false;
	        }
	        
	        if(N - point > 0) flag = false;
	        else flag = true;
	        
	        if(flag) {
	            result = mid;
	            end = mid - 1;
	        }
	        else    
	            start = mid + 1;
	    }
	    System.out.println(result);
	}
}
