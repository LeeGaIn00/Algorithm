import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st = new StringTokenizer(br.readLine());
	   
	    List<Integer> r_list = new ArrayList<>();
	    List<Integer> c_list = new ArrayList<>();
	    
	    int w = Integer.parseInt(st.nextToken());
	    int h = Integer.parseInt(st.nextToken());
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    r_list.add(0);
	    c_list.add(0);
	   
	    for(int i = 0; i < n; i++) {
	        st = new StringTokenizer(br.readLine());
	        int type = Integer.parseInt(st.nextToken());
	        
	        if(type == 0)
	            r_list.add(Integer.parseInt(st.nextToken()));
	        else 
	            c_list.add(Integer.parseInt(st.nextToken()));
	    }
	    
	    r_list.add(h);
	    c_list.add(w);
	    
	    Collections.sort(r_list);
	    Collections.sort(c_list);

        int max = 0;

	    for(int i = r_list.size() - 1; i > 0; i--) {
	        int r = r_list.get(i) - r_list.get(i - 1);
	        for(int j = c_list.size() - 1; j > 0; j--) {
	            int c = c_list.get(j) - c_list.get(j - 1);
	            int temp = r * c;
	            max = Math.max(max, temp);
	        }
	    }
	       
	    System.out.println(max);
	}
}