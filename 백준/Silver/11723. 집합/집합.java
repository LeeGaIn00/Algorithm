import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    StringBuilder sb = new StringBuilder();
	    int S = 0;
	    
	    int M = Integer.parseInt(br.readLine());
	    for(int i = 0; i < M; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        String s = st.nextToken();
	        
	        if(s.equals("all"))
	            S = (1 << 21) - 1;
	        else if(s.equals("empty"))
	            S = 0;
	        else {
	            int n = Integer.parseInt(st.nextToken());
	            
	            if(s.equals("add"))
	                S |= (1 << n);
	            else if(s.equals("remove"))
                    S &= ~(1 << n);
	            else if(s.equals("check"))
	                sb.append((S & (1 << n)) != 0 ? 1 : 0).append("\n");
	            else if(s.equals("toggle"))
	                S ^= (1 << n);
	        }
	    }
	    
	    System.out.println(sb);    
	}
	
}
