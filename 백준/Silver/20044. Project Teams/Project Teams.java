import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int n = Integer.parseInt(br.readLine());
	    int w[] = new int[2 * n];
	    int arr[] = new int[n];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < 2 * n; i++) 
	        w[i] = Integer.parseInt(st.nextToken());
	        
	    Arrays.sort(w);
	    
	    for(int i = 0; i < n; i++)
	        arr[i] = w[2 * n - i - 1] + w[i];
	        
	    Arrays.sort(arr);
        
		System.out.println(arr[0]);
	}
}