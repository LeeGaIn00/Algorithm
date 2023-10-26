import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int arr[] = new int[N];
	    
	    for(int i = 0; i < N; i++)
	        arr[i] = Integer.parseInt(br.readLine());
	   
	    Arrays.sort(arr);
	    
	    long max = 0;
	    for(int i = N - 1; i >= 0; i--) {
	        if(max < arr[i] * (N - i))
	            max = arr[i] * (N - i);
	    }

	    System.out.println(max);
	}
}