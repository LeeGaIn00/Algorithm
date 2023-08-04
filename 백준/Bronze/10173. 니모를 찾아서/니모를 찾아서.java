import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = "";
	    String reg = "(?i).*nemo.*";
	    while(!(str = br.readLine()).equals("EOI")) {
	        if(str.matches(reg))
	            System.out.println("Found");
	        else
	            System.out.println("Missing");
	        
	    }
	}
}
