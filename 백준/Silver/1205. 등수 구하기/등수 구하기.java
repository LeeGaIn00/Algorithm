import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
	    int score = Integer.parseInt(st.nextToken());
	    int P = Integer.parseInt(st.nextToken());
	    int arr[] = new int[P];
	    
	    if(N > 0) {
	        st = new StringTokenizer(br.readLine());
	        for(int i = 0; i < N; i++) 
	            arr[i] = Integer.parseInt(st.nextToken());
	     
	    }
	    
	    Arrays.sort(arr);
	    
	    if(N == P && arr[0] >= score) {
	        System.out.println(-1);
	        return;
	    }
	    
	    int rank = 1;
	    for(int i = P - 1; i >= Math.max(0, P-N-1); i--) {
	        if(arr[i] > score) rank++;
	        else break;
	    }
	    
	    System.out.println(rank);
	}
}
