import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	    String name[][] = new String[N][2];
	    
	    for(int i = 0; i < N; i++) {
	       st = new StringTokenizer(br.readLine());
	       name[i][0] = st.nextToken();
	       name[i][1] = st.nextToken();
	    }
	    
	    for(int i = 0; i < M; i++) {
	        int n = Integer.parseInt(br.readLine());
	        
	        int start = 0;
	        int end = N - 1;
	        int mid = 0;
	        while(start <= end) {
	            mid = (start + end) / 2;
	            int num = Integer.parseInt(name[mid][1]);
	            
	            if(num < n)
	                start = mid + 1;
	            else
	                end = mid - 1;
	        }
	        sb.append(name[start][0]).append("\n");
	    }
	    System.out.println(sb);
	}
}
