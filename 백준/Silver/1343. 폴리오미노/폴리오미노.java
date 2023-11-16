import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    StringBuilder sb = new StringBuilder();
	    
	    String str = br.readLine();
	    
	    String[] arr = str.split("\\.");
	     
	    for(int i = 0; i < arr.length; i++) {
	        String s = arr[i];
	        
	        if(s.length() % 2 != 0) {
	            System.out.println(-1);
	            return;
	        }
	        
	        else if(s.length() % 4 == 0)
	            sb.append("AAAA".repeat(s.length() / 4));
	            
	        else
	            sb.append("AAAA".repeat(s.length() / 4)).append("BB");
	            
	        if(i != arr.length - 1)
	            sb.append(".");
	        
	    }
	    
	    sb.append(".".repeat(str.length() - sb.toString().length())); 
	    
	    System.out.println(sb);
	}
}