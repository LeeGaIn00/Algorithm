import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    StringBuffer sb = new StringBuffer();
	    
	    int N = Integer.parseInt(st.nextToken());
	    int M = Integer.parseInt(st.nextToken());
	   
	    HashSet<String> keyword  = new HashSet<>();
	    
	    for(int i = 0; i < N; i++)
	        keyword.add(br.readLine());
	        
	    for(int i = 0; i < M; i++) {
	        st = new StringTokenizer(br.readLine(), ",");
	        
	        while(st.hasMoreTokens()) {
	            String key = st.nextToken();
	            
	            if(keyword.contains(key))
	                keyword.remove(key);
	        }
	         sb.append(keyword.size()).append("\n");
	    }
	    
	    System.out.println(sb);    
	}
	
}
