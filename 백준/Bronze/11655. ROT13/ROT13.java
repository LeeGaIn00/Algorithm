import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++) {
		    char c = str.charAt(i);
		    if(c >= 'a' && c <= 'z') {
		        c += 13;
		        
		        if(c > 'z') {
		            int tmp = (int)(c - 'z');
		            c = 'a' - 1;
		            c += tmp;
		        }
		    }
		    
		    else if(c >= 'A' && c <= 'Z') {
		        c += 13;
		        
		        if(c > 'Z') {
		            int tmp = (int)(c - 'Z');
		            c = 'A' - 1;
		            c += tmp;
		        }
		    }
		    sb.append(c);
		}
		
		System.out.println(sb);
	}
}
