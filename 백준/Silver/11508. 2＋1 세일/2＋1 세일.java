import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    int N = Integer.parseInt(br.readLine());
	    Integer arr[] = new Integer[N];
	    int sum = 0;
	    
	    for(int i = 0; i < N; i++)
	        arr[i] = Integer.parseInt(br.readLine());
	        
	    Arrays.sort(arr, Comparator.reverseOrder());
	    
	    for(int i = arr.length - 1; i >= 0; i--) {
	        if(i % 3 == 2) continue;
	        sum += arr[i];
	    }
	    
	    System.out.print(sum);
	}
}