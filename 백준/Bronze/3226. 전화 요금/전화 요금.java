import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    int N = Integer.parseInt(br.readLine());
	    int total = 0;
	    
	    for(int i = 0; i < N; i++) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        
	        String t[] = st.nextToken().split(":");
	        int time = Integer.parseInt(st.nextToken());
	        
	        int h = Integer.parseInt(t[0]);
	        int m = Integer.parseInt(t[1]);
	        
	        m += time;
	        
	        if(m > 60) {
	            if(h == 6) {
	                total += 5 * (time - (m - 60));
	                total += 10 * (m - 60);
	            }
	            else if(h == 18) {
	                total += 10 * (time - (m - 60));
	                total += 5 * (m - 60);
	            }
	            else {
	                if(h >= 7 && h <= 18)
	                    total += 10 * time;
	                else    
	                    total += 5 * time;
	            }
	        }
	        else {
	            if(h >= 7 && h <= 18)
	                total += time * 10;
	            else
	                total += time * 5;
	            
	        }
	    }
            
		System.out.println(total);
	}
}