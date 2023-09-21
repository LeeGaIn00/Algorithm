import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    int n = Integer.parseInt(st.nextToken());
	    String game = st.nextToken();
	    Set<String> set = new HashSet<>();
	    int ans = 0;
	    
	    for(int i = 0; i < n; i++) 
	        set.add(br.readLine());
	        
	    if(game.equals("Y")) ans = set.size();
	    else if(game.equals("F")) ans = set.size() / 2;
	    else ans = set.size() / 3;
	    
	    System.out.println(ans);
		
	}
}
