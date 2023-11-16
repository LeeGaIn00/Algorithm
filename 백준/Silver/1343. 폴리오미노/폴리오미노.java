import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    StringBuilder sb = new StringBuilder();
	    
	    str = str.replaceAll("XXXX", "AAAA").replaceAll("XX", "BB");
	    
	    if(str.contains("X")) 
	        sb.append(-1);
	        
	    else
	        sb.append(str);
	    
	    System.out.println(sb);
	}
}