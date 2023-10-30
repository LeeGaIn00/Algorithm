import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    Map<String, Integer> map = new HashMap<>();
	    
	    int N = Integer.parseInt(br.readLine());
	    for(int i = 0; i < N; i++) {
	        String str = br.readLine();
	        map.put(str, map.getOrDefault(str, 0) + 1);
	    }
	    
	    List<String> keySet = new ArrayList<>(map.keySet());
	    keySet.sort(new Comparator<String>() {
	       @Override
	       public int compare(String o1, String o2) {
	           if(map.get(o1) == map.get(o2))
	                return o1.compareTo(o2);
	                
	           return map.get(o2) - map.get(o1);
	       }
	    });
	    
		System.out.println(keySet.get(0));
	}
}
