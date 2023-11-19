import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    while(true) {
	        String str = br.readLine();
	        Stack<Character> st = new Stack<>();
	        boolean flag = true;
	        
	        if(str.equals(".")) return;
	        
	        for(int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            
	            if(c == '(' || c == '[')
	                st.push(c);
	               
	            else if(c == ')') {
	                if(st.isEmpty() || st.peek() != '(') {
	                    flag = false;
	                    break;
	                }
	                else
	                    st.pop();
	            }
	            
	            else if(c == ']') {
	                if(st.isEmpty() || st.peek() != '[') {
	                    flag = false;
	                    break;
	                }
	                else
	                    st.pop();
	            }  
	        }
	        
	        if(st.isEmpty() && flag)
	            System.out.println("yes");
	        else 
	            System.out.println("no");
	    }
	   
	}
}
