import java.util.*;
import java.io.*;

public class Main
{
    
    static int[] arr;
    static Integer[] dp;
    static int max;
    
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    Map<Character, Integer> map = new HashMap<>();
	    
	    for(int i = 0; i < N; i++) {
	        String str = br.readLine();
	        char c = str.charAt(0);
	        
	        map.put(c, map.getOrDefault(c, 0) + 1);
	    }
	   
	    List<Character> keySet = new ArrayList<>(map.keySet());
	    Collections.sort(keySet);
	    
	    
    	 for(char k : keySet) {
    	        if(map.get(k) >= 5)
    	            sb.append(k);
    	 }
    	            
    	  if(sb.length() == 0)
	            System.out.print("PREDAJA");
	      else 
	            System.out.print(sb);
	}
}
