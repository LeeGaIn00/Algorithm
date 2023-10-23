import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    long ans = 0;
	    
	    int N = Integer.parseInt(br.readLine());
	    int arr[] = new int[N];
	    
	    for(int i = 0; i < N; i++) 
	        arr[i] = Integer.parseInt(br.readLine());
	        
	    Arrays.sort(arr);
	    
	    for(int i = 0; i < N; i++)
	        ans += Math.abs(arr[i] - (i + 1));
            
		System.out.println(ans);
	}
}