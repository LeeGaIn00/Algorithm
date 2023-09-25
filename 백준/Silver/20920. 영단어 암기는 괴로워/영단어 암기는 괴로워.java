import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

	    HashMap<String, Integer> map = new HashMap<>();
	    
	    for(int i = 0; i < N; i++) {
	        String word = br.readLine();
	        if(word.length() >= M)
	            map.put(word, map.getOrDefault(word, 0) + 1);
	    }
	    
	    List<String> list = new ArrayList<>(map.keySet());
	    list.sort(new Comparator<String>() {
	        @Override
	        public int compare(String o1, String o2) { 
	            if(map.get(o1) == map.get(o2)) { // 빈도수 같으면
	                if(o1.length() == o2.length()) // 길이 같으면
	                    return o1.compareTo(o2); // 알파벳 사전순
	                return o2.length() - o1.length(); // 길이 긴 순
	            }
	            return map.get(o2) - map.get(o1); // 빈도순
	        }
	    });
	    
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < list.size(); i++)
	        sb.append(list.get(i)).append("\n");
	    
	    System.out.println(sb);
	}
}
