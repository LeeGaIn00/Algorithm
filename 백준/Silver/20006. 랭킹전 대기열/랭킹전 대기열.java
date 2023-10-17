import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int p = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		
		for(int i = 0; i < p; i++) {
		    st = new StringTokenizer(br.readLine());
		    int level = Integer.parseInt(st.nextToken());;
		    String name = st.nextToken();
		    map.put(name, level);
		}
		
		while(map.size() != 0) {
		    ArrayList<String> room = new ArrayList<>();
		    int cnt = 0;
		    String first = "";
		    
		    for(String s : map.keySet()) {
		        if(cnt == m)
		            break;
		        if(cnt == 0) {
		            first = s;
		            room.add(s);
		            cnt++;
		        }
		        else {
		            int low = map.get(first) - 10;
		            int high = map.get(first) + 10;
		            if(map.get(s) >= low && map.get(s) <= high) {
		                room.add(s);
		                cnt++;
		            }
		        }
		    }
		    
		    Collections.sort(room);
		    
		    if(room.size() < m)
		        sb.append("Waiting!" + "\n");
		    else
		        sb.append("Started!" + "\n");
		    for(int i = 0; i < room.size(); i++) {
		        sb.append(map.get(room.get(i)) + " " + room.get(i) + "\n");
		        map.remove(room.get(i));
		    }
		}
		System.out.println(sb);
	}
}
