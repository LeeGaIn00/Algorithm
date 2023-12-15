import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String str = br.readLine();
	    
	    int zero = 0;
	    int one = 0;
	    
	    if(str.charAt(0) == '0') zero++;
	    else one++;
	    
	    for(int i = 1; i < str.length(); i++) {
	        if(str.charAt(i - 1) != str.charAt(i)) {
	            if(str.charAt(i) == '0')
	                zero++;
	            else 
	                one++;
	        }
	    }
	
	    System.out.println(Math.min(zero, one)); 
	}
}
