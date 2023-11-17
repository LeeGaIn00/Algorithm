import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    long ans = 0;
	    
	    int N = Integer.parseInt(br.readLine());
	    int arr[] = new int[N];
	    
	    for(int i = 0; i < N; i++)
	        arr[i] = Integer.parseInt(br.readLine());
	        
	   Arrays.sort(arr);
	   
	   for(int i = arr.length - 1; i >= 0; i--) {
	       if(arr[i] - (N - i - 1) <= 0)
	            break;
	        
	       ans += arr[i] - (N - i - 1);
	   }
	   
	    System.out.println(ans);
	}
}