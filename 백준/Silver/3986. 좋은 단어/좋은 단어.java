import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    int N = Integer.parseInt(br.readLine());
	    int cnt = 0;
	    
	    for(int i = 0; i < N; i++) {
	        String str = br.readLine();
	        Stack<Character> st = new Stack<>();
	        int len = str.length();
	        st.push(str.charAt(0));
	        
	        for(int j = 1; j < len; j++) {
	            char now = str.charAt(j);
	            
	            if(!st.isEmpty()) {
	                char prev = st.peek();
	                if(prev == now) {
	                    st.pop();
	                    continue;
	                }
	            }
	            st.push(now);
	        }
	        if(st.isEmpty())
	            cnt++;
	    }
	    
	    System.out.println(cnt);
	   
	}
}
