import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

	    int M = Integer.parseInt(st.nextToken());
	    int N = Integer.parseInt(st.nextToken());
	    
	    String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	    Map<String, Integer> map = new HashMap<>();
	    
	    for(int i = M; i <= N; i++) {
	        int ten = i / 10;
	        int one = i % 10;
	        
	        if(ten == 0)
	            map.put(arr[one], i);
	        else
	            map.put(arr[ten] + " " + arr[one], i);
	    }
	    
	    List<String> keySet = new ArrayList<>(map.keySet());
	    Collections.sort(keySet);
	    
	    for(int i = 0; i < keySet.size(); i++) {
	        System.out.print(map.get(keySet.get(i)) + " ");
	        if(i % 10 == 9)
	            System.out.println();
	    }

	}
}