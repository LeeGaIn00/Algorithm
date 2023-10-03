import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    HashMap<Integer, Integer> map = new HashMap<>();
	    StringBuilder sb = new StringBuilder();
	    
	    int N = Integer.parseInt(br.readLine());
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < N; i++) {
	        int n = Integer.parseInt(st.nextToken()); 
	        map.put(n, map.getOrDefault(n, 0) + 1);
	    }
	    
	    int M = Integer.parseInt(br.readLine());
	    st = new StringTokenizer(br.readLine());
	    for(int i = 0; i < M; i++) {
	        int n = Integer.parseInt(st.nextToken());
	        
	        if(map.get(n) == null) sb.append(0).append(" ");
	        else sb.append(map.get(n)).append(" ");
	    }
	    
	    System.out.println(sb);
	}
}
