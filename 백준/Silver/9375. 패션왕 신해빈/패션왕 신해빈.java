import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int T = Integer.parseInt(br.readLine());
	    
	    for(int i = 0; i < T; i++) {
	        int n = Integer.parseInt(br.readLine());
	        Map<String, Integer> map = new HashMap<>();
	        
	        for(int j = 0; j < n; j++) {
    	        String[] str = br.readLine().split(" ");
	            map.put(str[1], map.getOrDefault(str[1], 0) + 1);
	        } 
	        
	        int res = 1;
	        for(int val : map.values())
	            res *= val + 1;
	        
	        System.out.println(res - 1);  
	    }
	}
}
